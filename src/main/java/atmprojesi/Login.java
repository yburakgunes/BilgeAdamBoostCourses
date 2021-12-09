package atmprojesi;
// özellikler
// parametresiz constructor
// parametreli constructor
// toString
// getter and setter

public class Login {
	
	private String userName;
	private String userPassword;
	private String userEmailAddress;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	public Login(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public Login(String userName, String userPassword, String userEmailAddress) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmailAddress = userEmailAddress;
	}
	
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", userPassword=" + userPassword + ", userEmailAddress="
				+ userEmailAddress + "]";
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserEmailAddress() {
		return userEmailAddress;
	}
	
	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}
	
}
