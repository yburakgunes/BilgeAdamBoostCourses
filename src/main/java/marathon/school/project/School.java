package marathon.school.project;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private String address;
	List<Workers> employeeList;
	
	public School() {
		// TODO Auto-generated constructor stub
	}
	
	public School(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.employeeList = new ArrayList<Workers>();
	}
	
	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Workers> getEmployeeList() {
		return employeeList;
	}
	
	public void setEmployeeList(List<Workers> employeeList) {
		this.employeeList = employeeList;
	}
	
}
