package com.bilgeadam.clientserver3;

import java.util.Date;

public class ClientServerTuto {
	private int id;
	private int port;
	private String ipAddress;
	private Date logsDate;
	
	public ClientServerTuto() {
		this.port = 8888;
		this.ipAddress = "localhost";
		
	}
	
	public ClientServerTuto(int id, int port, String ipAddress) {
		super();
		this.id = id;
		this.port = port;
		this.ipAddress = ipAddress;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public Date getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(Date logsDate) {
		this.logsDate = logsDate;
	}
	
}
