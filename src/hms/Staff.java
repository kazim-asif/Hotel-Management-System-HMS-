package hms;

public class Staff extends User {
	
	private String password;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String id, String password) {
		super(name, id);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
