package Java_project_phase2;

public class User {
	protected String username;
	protected String phonenumber;
	protected String password;
	public User(String username, String phonenumber, String password) {
		super();
		this.username = username;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	public User()
	{
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
