package model;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String skill;

	public Employee() {
	}

	public Employee(String name, int salary, String skill) {
		super();
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}

	public Employee(int id, String name, int salary, String skill) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skill = skill;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
