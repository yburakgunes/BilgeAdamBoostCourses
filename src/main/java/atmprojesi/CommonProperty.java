package atmprojesi;

import java.util.Date;

public class CommonProperty {
	
	private String id;
	private Date date;
	
	public CommonProperty() {
		this.date = new Date(System.currentTimeMillis());
	}
	
	public CommonProperty(String id) {
		this.id = id;

	}
	
	@Override
	public String toString() {
		return "CommonProperty [id=" + id + ", date=" + date + "]";
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
}
