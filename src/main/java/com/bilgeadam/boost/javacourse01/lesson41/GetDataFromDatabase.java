package com.bilgeadam.boost.javacourse01.lesson41;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetDataFromDatabase {
	
	private static String url = "jdbc:postgresql://localhost:5432/northwind?user=postgres&password=root";
	static String orderSelect = "select * from orders as o where o.shipvia =? limit 5;";
	static String select = "select * from orders as o where o.orderid = 10248;";
	
	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(url);
				PreparedStatement pStmt = con.prepareStatement(orderSelect);
				Statement stmt = con.createStatement();) { 
			
			ResultSet rs = stmt.executeQuery(select);
			while (rs.next()) {	
				String shipName = rs.getString(9);
				String shipAddress = rs.getString("shipaddress");
				System.out.println(shipName + "- " + shipAddress + " PREPARED STATEMENT ----");
				pStmt.setInt(1, shipViaNumber(con));
				ResultSet ordersRS = pStmt.executeQuery();
				while (ordersRS.next()) {
					System.out.println(ordersRS.getInt(7) + "--" + ordersRS.getString(9) + "--" + ordersRS.getString(10));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int shipViaNumber(Connection con) throws SQLException {
		
		ResultSet rs2 = con.createStatement().executeQuery("select count(distinct o.shipvia) from orders as o;");
		rs2.next();
		return rs2.getInt(1);
	}

}