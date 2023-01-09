package possible_Combi_java8_Objec_Attributes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
	static List<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// Query 1 : How many male and female employees are there in the organization?
		method1();
		System.out.println("\n");
		// Query 2 : Print the name of all departments in the organization?
		method2();
		System.out.println("\n");
		// Query 3 : What is the average age of male and female employees?
		method3();
		System.out.println("\n");
		// Query 4 : Get the details of highest paid employee in the organization?
		method4();
		System.out.println("\n");
		// Query 5 : Get the names of all employees who have joined after 2015?
		method5();
		System.out.println("\n");
		// Query 6 : Count the number of employees in each department?
		method6();
		System.out.println("\n");
		// Query 7 : What is the average salary of each department?
		method7();
		System.out.println("\n");
		// Query 8 : Get the details of youngest male employee in the product
		// development department?
		method8();
		System.out.println("\n");
		// Query 9 : Who has the most working experience in the organization?
		method9();
		System.out.println("\n");
		// Query 10 : How many male and female employees are there in the sales and
		// marketing team?
		method10();
		System.out.println("\n");
		// Query 11 : What is the average salary of male and female employees?
		method11();
		System.out.println("\n");
		// Query 12 : List down the names of all employees in each department?
		method12();
		System.out.println("\n");
		// Query 13 : What is the average salary and total salary of the whole
		// organization?
		method13();
		System.out.println("\n");
		// Query 14 : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.
		method14();
		System.out.println("\n");
		// Query 15 : Who is the oldest employee in the organization? What is his age
		// and which department he belongs to?
		method15();

	}

	private static void method1() {
		employeeList
		.stream()
		.collect(Collectors
		.groupingBy(Employee::getGender,Collectors.counting()))
		.forEach((x,v)->System.out.println(x+" :: "+v));
	}

	private static void method2() {
		employeeList
		.stream()
		.map(Employee::getDepartment)
		.collect(Collectors.toSet())
		.forEach(x->System.out.println(x));
		
		System.out.println("\n");
		
		employeeList
		.stream()
		.map(Employee::getDepartment)
		.distinct()
		.forEach(x->System.out.println(x));
		
	}

	private static void method3() {
		System.out.println(" Query 3 : What is the average age of male and female employees?");
		Map<String,Double> collect = employeeList
		.stream()
		.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(collect);
	}

	private static void method4() {
		System.out.println("Query 4 : Get the details of highest paid employee in the organization?");
		Employee employee = employeeList
		.stream()
		.distinct()
		.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
		System.out.println(employee);
		
//		 employeeList
//		 .stream()
//		 .collect(Collectors.groupingBy(
//       e -> e.getDepartment(),
//       Collectors
//      .collectingAndThen(Collectors.
//       comparingDouble(Employee::getSalary), Optional.get())) 
//        );
		
	}

	private static void method5() {
		System.out.println("Get the names of all employees who have joined after 2015?");
		System.out.println("\n");
		employeeList
		.stream()
		.filter(emp->emp.getYearOfJoining()>2015)
		.forEach(x->System.out.println(x));
		
	}

	private static void method6() {
		System.out.println("count the number of employee in each department");
		System.out.println("\n");
		Map<String,Long> collect = employeeList
		.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		//		.forEach((x,v)->System.out.println(x+"::::::"+v));
		
		Set<Entry<String,Long>> entrySet = collect.entrySet();
		
		for(Entry<String,Long> entry:entrySet) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}

	private static void method7() {
		System.out.println(" What is the average salary of each department?\");");
		Map<String,Double> collect = employeeList
		.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		Set<Entry<String,Double>> entrySet = collect.entrySet();
		for(Entry<String,Double> entry:entrySet) {
			System.out.println(entry.getKey()+":::"+entry.getValue());
		}
	}

	private static void method8() {
		System.out.println(" Get the details of youngest male employee in the product\r\n"
				+ "		// development department?");
		Employee employee = employeeList
		.stream()
		.filter(x->x.getGender().equals("Male") && x.getDepartment().equals("Product Development"))
		.min(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("employee Details::"+employee.getId()+":"+employee.getName());
		
	}

	private static void method9() {
		System.out.println("Who has the most working experience in the organization?");
		
		Employee employee = employeeList
		.stream()
		.sorted(Comparator.comparingInt(Employee::getYearOfJoining))
		.findFirst()
		.get();
		System.out.println(employee);
		
	}

	private static void method10() {
		System.out.println(" How many male and female employees are there in the sales and\r\n"
				+ "		// marketing team?");
		
		employeeList
		.stream()
		.filter(x->x.getDepartment()=="Sales And Marketing")
		.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
		.forEach((x,v)->System.out.println(x+"::::::"+v));
		
	}

	private static void method11() {
		System.out.println(" What is the average salary of male and female employees?");
		
		Map<String,Double> collect = employeeList
		.stream()
		.collect(Collectors.groupingBy
		(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<String,Double>> entrySet = collect.entrySet();
		for(Entry<String,Double> entry:entrySet) {
			System.out.println(entry.getKey()+":::"+entry.getValue());
		}
	}

	private static void method12() {
		System.out.println("List down the names of all employees in each department?");
		Map<String,List<Employee>> collect = employeeList
		.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment));
		
		Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
		
		for(Entry<String,List<Employee>> entry:entrySet) {
			System.out.println("getDepartment===="+entry.getKey());
			List<Employee> listofName = entry.getValue();
			for(Employee name:listofName) {
				System.out.println(name);
			}
		}
	}

	private static void method13() {
		System.out.println("What is the average salary and total salary of the whole organization?");
		DoubleSummaryStatistics collect = employeeList
		.stream()
		.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("total salary of employee::"+collect.getSum());
		System.out.println("avg salary of total employee::"+collect.getAverage());
		
	}

	private static void method14() {
		System.out.println("Separate the employees who are younger or equal to 25 years from\r\n"
				+ "		// those employees who are older than 25 years.");
		Map<Boolean,List<Employee>> partitionByAge = employeeList
		.stream()
		.collect(Collectors.partitioningBy(e->e.getAge()>25));
		
		Set<Entry<Boolean,List<Employee>>> entrySet = partitionByAge.entrySet();
		
		for(Entry<Boolean,List<Employee>> entry:entrySet) {
			System.out.println("------------------");
			
			if (entry.getKey()) {
				System.out.println("Employees older than by 25 years");
			}
			else {
				System.out.println("Employee are younger than or equal to 25 years");
			}
			System.out.println("------------------");
			
			List<Employee> listOfName=entry.getValue();
			
			for(Employee name:listOfName) {
				System.out.println("***"+name.getName()+"***");
			}
		}
	}

	private static void method15() {
		System.out.println(" Who is the oldest employee in the organization? What is his age\r\n"
				+ "		// and which department he belongs to?");
		
		Employee employee = employeeList
		.stream()
		.max(Comparator.comparingInt(Employee::getAge))
		.get();
		
		System.out.println("::"+employee.getName()+"::"+employee.getAge()+"::"+employee.getDepartment());
		
	}
}
