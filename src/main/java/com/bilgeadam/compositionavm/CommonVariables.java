package com.bilgeadam.compositionavm;

public class CommonVariables {
	protected String logsDate;
	protected int id;
	
	public CommonVariables() {
		// TODO Auto-generated constructor stub
	}
	
	public CommonVariables(String logsDate, int id) {
		super();
		this.logsDate = logsDate;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "CommonVariables [logsDate=" + logsDate + ", id=" + id + "]";
	}
	
	public String getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(String logsDate) {
		this.logsDate = logsDate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
