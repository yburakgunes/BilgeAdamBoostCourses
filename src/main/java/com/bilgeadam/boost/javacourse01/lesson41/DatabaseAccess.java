package com.bilgeadam.boost.javacourse01.lesson41;

import java.sql.*;

public class DatabaseAccess {
	
	private static String url = "jdbc:postgresql://localhost:5432/northwind";
	
	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(url, "postgres", "root");) {
			Statement stmt = con.createStatement();
			// selectFromEmployees(stmt);
			// updateEmployeeByID(stmt, 5);
			for (int i = 1; i <= employeeNumber(stmt); i++) {
				
				selectFromEmployees(stmt, i);
			}
			
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
//	private static void updateEmployeeByID(Statement stmt, int id) throws SQLException {
//		int affected = stmt.executeUpdate("UPDATE employees SET address='14 Garrett Hill ' WHERE employeeid=" + id);
//		System.out.println("Değiştirien satır adedi: " + affected);
//	}
//	
//	private static void selectFromEmployees(Statement stmt) throws SQLException {
//		ResultSet rs = stmt.executeQuery("SELECT * FROM employees;");
//		while (rs.next()) {
//			int id = rs.getInt("employeeid");
//			System.out.println(id + " - " + rs.getString(2) + " " + rs.getString("firstname"));
//			// ya kolon numarası (birden başlayarak) ya da kolon adı ile bilgiler çekilir
//		}
//	}
	
	public static void selectFromEmployees(Statement stmt, int employeeId) throws SQLException {
		
		String query = "SELECT e.firstname, e.lastname, o.orderid, o.customerid, o.freight FROM employees e JOIN orders o ON e.employeeid"
				+ " = o.employeeid WHERE e.employeeid =" + employeeId + " ORDER BY o.customerid ASC LIMIT 5";
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			// System.out.println(rs.getInt("orderid") + " " + rs.getString("firstname") + "
			// " + rs.getString("lastname")
			// + " " + rs.getString("customerid") + " " + rs.getString("freight"));
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)
					+ " " + rs.getString(5));
			
		}
	}
	
	public static int employeeNumber(Statement stmt) throws SQLException {
		String query = "SELECT count(*) FROM employees";
		ResultSet rs = stmt.executeQuery(query);
		rs.next();
		
		return rs.getInt(1);
		
	}
}
