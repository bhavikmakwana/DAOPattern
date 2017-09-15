package model;

public class Employee {
	private int id;
	private String fristname;
	private String middlename;
	private String lastname;
	private int age;
	private String address;
	
	public Employee() {}
	
	public Employee(int id, String fristname, String middlename, String lastname, int age, String address) {
		super();
		this.id = id;
		this.fristname = fristname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristname() {
		return fristname;
	}

	public void setFristname(String fristname) {
		this.fristname = fristname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fristname=" + fristname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	
}
