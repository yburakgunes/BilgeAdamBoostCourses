package com.bilgeadam.clientserverhw;

public class IpAndPort {
	private String ip;
	private int port;
	
	public IpAndPort() {
		
	}
	
	public IpAndPort(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	
	
	public IpAndPort(int port) {
		super();
		this.port = port;
	}

	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
}
