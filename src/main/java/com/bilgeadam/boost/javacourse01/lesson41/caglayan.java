//package com.bilgeadam.boost.javacourse01.lesson41;
//
//public class caglayan {
//	package com.caglayan.boost.jdbcchallenge;
//
//
//
//	import java.sql.*;
//
//
//
//	public class DBOperations {
//	private String url = "jdbc:postgresql://localhost:5432/northwind";
//
//	public int getEmployeeCount() {
//	try (Connection con = DriverManager.getConnection (this.url, "boost", "boost")) {
//	Statement statement = con.createStatement();
//	ResultSet rs = statement.executeQuery("SELECT COUNT(*) employeecount FROM employees");
//	rs.next();
//	return rs.getInt("employeecount");
//	} catch (Exception e) {
//	e.printStackTrace();
//	}
//	return -1;
//	}
//
//	public ResultSet selectFromEmployee(int employeeId){
//	try (Connection con = DriverManager.getConnection (this.url, "boost", "boost")) {
//	Statement statement = con.createStatement();
//	String query = "SELECT e.firstname, e.lastname, o.orderid, o.customerid, o.freight FROM employees e JOIN orders o "
//	+ "ON e.employeeid = o.employeeid WHERE e.employeeid = "+ employeeId +" ORDER BY o.customerid ASC LIMIT 5";
//	ResultSet rs = statement.executeQuery(query);
//	return rs;
//	} catch (Exception e) {
//	e.printStackTrace();
//	}
//	return null;
//	}
//
//	public void queryLoop() {
//	int count = getEmployeeCount();
//	for (int i = 1; i <= count; i++) {
//	ResultSet rs = selectFromEmployee(i);
//
//	try {
//	while(rs.next()) {
//	System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
//
//
//
//	}
//	} catch (SQLException e) {
//	e.printStackTrace();
//	}
//	}
//	}
//	}
//}
