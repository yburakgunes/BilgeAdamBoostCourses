package com.bilgeadam.boost.javacourse01.lesson42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class CategoryName2EmployeeThurs {
	
	public static void main(String[] args) {
		
		DatabaseHelper dbH = DatabaseHelper.getInstance();
		
		String select = "SELECT categoryid, categoryname, description FROM categories ORDER BY categoryname;";
		
		BAUtils.header("Sipariş Şikayet");
		Connection con = null;
		
		HashMap<Integer, String> categories = new HashMap<>();
		try {
			con = dbH.getConnection();
			System.out.println(con);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			while (rs.next()) {
				int key = rs.getInt("categoryid");
				String value = rs.getString("categoryname") + " (" + rs.getString("description") + ")";
				categories.put(key, value);
			}
		} catch (SQLException ex1) {
			ex1.printStackTrace();
		}
		
		MenuHelper.getInstance().setMenuItems(categories);
		
		boolean cont = true;
		
		while (cont) {
			int categoryId = 1;
			try {
				categoryId = BAUtils.menu(MenuHelper.getInstance().getMenuItems());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			findEmployee(categoryId);
			cont = BAUtils.wantToEnd("Devam etmek isityor musunuz (evet/hayır)?", "hayır");
		}
		BAUtils.footer();
	}
	
	private static void findEmployee(int id) {
		
		String select = "SELECT DISTINCT firstname, lastname "
				+ "FROM categories a, products p, order_details c, orders b, employees d "
				+ "WHERE a.categoryid=p.categoryid AND " + "p.productid=c.productid AND "
				+ "c.orderid=b.orderid AND b.employeeid=d.employeeid " + "AND a.categoryid=? " + "ORDER BY firstname;";
		
		try {
			DatabaseHelper dbH = DatabaseHelper.getInstance();
			Connection con = dbH.getConnection();
			System.out.println(con);
			PreparedStatement pStmt = con.prepareStatement(select);
			pStmt.setInt(1, id);
			ResultSet ordersResultSet = pStmt.executeQuery();
			
			int i = 1;
			while (ordersResultSet.next()) {
				System.out.println(i++ + " - " + ordersResultSet.getString(1) + " " + ordersResultSet.getString(2));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
}

/*
 * do {
 * listCategorie = sqlConnect.getListCategoriegs();
 * int ichoose = ConsoleHelper.getInstance().showMenu("Kategori Seç: ",
 * listCategorie.stream()
 * .collect(Collectors.toMap(Categorie::getCategoryid,
 * Categorie::getCategoryname)));
 * chooseCategorieg(ichoose, sqlConnect);
 * } while (ConsoleHelper.getInstance().readInteger("\nÇıkış Yap ... [0]") !=
 * 0);
 */