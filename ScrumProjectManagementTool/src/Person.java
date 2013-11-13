
public class Person {

	private String personid;
	private String name;
	private String role;
	
	
	public String getId() {
		return personid;
	}

	public void setId(String id) {
		this.personid = id;
	}

	
	public Person(String id, String name, String role) {
		super();
		this.personid = id;
		this.name = name;
		this.role = role;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
