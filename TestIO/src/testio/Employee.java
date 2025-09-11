package testio;

public class Employee {
	private int id;
	private String name;
	private String departmentName;
	private double salary;
	private int age;
    
	public Employee() {
		super();
	}

	public Employee(int id, String name, String departmentName, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.departmentName = departmentName;
		this.salary = salary;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
