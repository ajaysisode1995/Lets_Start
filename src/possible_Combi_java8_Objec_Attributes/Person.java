package possible_Combi_java8_Objec_Attributes;

public class Person {

	private long id;
	private String name;
	private String designation;
	private String city;
	private int age;
	private double salary;
	public Person(long id, String name, String designation, String city, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.city = city;
		this.age = age;
		this.salary = salary;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", designation=" + designation + ", city=" + city + ", age="
				+ age + ", salary=" + salary + "]";
	}
	
}
