package model;

public class User {
	private String username;
	private String password;
	private String hovaTen;
	public User() {
		super();
	}
	public User(String username, String password, String hovaTen) {
		super();
		this.username = username;
		this.password = password;
		this.hovaTen = hovaTen;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHovaTen() {
		return hovaTen;
	}
	public void setHovaTen(String hovaTen) {
		this.hovaTen = hovaTen;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", hovaTen=" + hovaTen + "]";
	}
	
	
}
