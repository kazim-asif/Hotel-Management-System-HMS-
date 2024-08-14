package hms;

public class User {

	private String name;
	private String id;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
