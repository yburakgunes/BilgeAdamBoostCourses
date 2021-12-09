package com.bilgeadam.boost.javacourse01.lesson41;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CategoryName {
	
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/northwind?user=postgres&password=root";
		
		String query1 = "select e.firstname,e.lastname,e.title from employees as e\r\n"
				+ "join orders as o on o.employeeid = e.employeeid\r\n"
				+ "join order_details as od on od.orderid = o.orderid\r\n"
				+ "join products as p on p.productid = od.productid\r\n"
				+ "join categories as cat on p.categoryid = cat.categoryid\r\n" + "where cat.categoryname = ?\r\n"
				+ "GROUP by e.firstname,e.lastname,e.employeeid\r\n" + "order by e.employeeid asc";
		
		String query2 = "Select distinct firstname, lastname, title from categories a, products p, order_details c, orders b, employees d where "
				+ "a.categoryid=p.categoryid AND p.productid = c.productid AND c.orderid = b.orderid AND b.employeeid= d.employeeid AND a.categoryname = ?;";
		
		try (Connection con = DriverManager.getConnection(url);) {
			
			PreparedStatement pStmt = con.prepareStatement(query2);
			
			System.out.println("Lütfen kategorinizi giriniz: ");
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			
			pStmt.setString(1, name);
			ResultSet rs = pStmt.executeQuery();
			int i = 1;
			while (rs.next()) {
				System.out.println(i++ + "-) " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				
			}
			
		} catch (
		
		SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}
