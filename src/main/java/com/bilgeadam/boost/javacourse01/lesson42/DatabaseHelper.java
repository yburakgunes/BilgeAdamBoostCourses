package com.bilgeadam.boost.javacourse01.lesson42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
	
	private static DatabaseHelper instance = null;
	
	private final String URL;
	private Connection conn;
	
	private DatabaseHelper() {
		this.URL = "jdbc:postgresql://localhost:5432/northwind?user=postgres&password=root";
		this.conn = null;
	}
	
	public static DatabaseHelper getInstance() {
		if (DatabaseHelper.instance == null) {
			DatabaseHelper.instance = new DatabaseHelper();
		}
		return instance; // normal kullanımdaki new DatabaseHElper();'ı çağırmış gibi.
	}
	
	public Connection getConnection() {
		if (this.conn == null) { // ==> layz instantination: eğer değişkenin değeri null ise
			try { // ==> yeni bir nesne oluştur ve değişkene ata
				this.conn = DriverManager.getConnection(this.URL);
				
			} catch (SQLException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return this.conn; // ==> null değilse oluşmuş nesneyi döndür
	}
}
