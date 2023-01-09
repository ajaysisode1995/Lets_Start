package possible_Combi_java8_Objec_Attributes;

public class Employee1 {
	private int id;
	private String name;
	private double salary;
	private Number managerId;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Number getManagerId() {
		return managerId;
	}
	public void setManagerId(Number managerId) {
		this.managerId = managerId;
	}
	public Employee1(int id, String name, double salary, Number managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.managerId = managerId;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
	}
	
}
