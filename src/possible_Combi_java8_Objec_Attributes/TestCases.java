package possible_Combi_java8_Objec_Attributes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCases {
	static List<Employee1> l1=new ArrayList<>();
	public static void main(String[] args) {
		l1.add(new Employee1(1, "Tom", 200000, 2));
		l1.add(new Employee1(2, "John", 300000, 4));
		l1.add(new Employee1(3, "Sauhn", 250000, 2));
		l1.add(new Employee1(4, "Rober", 500000, null));
		l1.add(new Employee1(5, "Atul", 500000, 2));
		l1.add(new Employee1(6, "Sagar", 200000, 3));
		
		//calculate total expense salary of company for employees
		sumTotal_Salary(l1);
		System.out.println("\n");
		//find second highest salary with employee name
		secondHighest_salary(l1);
		System.out.println("\n");
		//4 Sort employee name based on Salary in ascending order
		salaryInAsecending(l1);
		System.out.println("\n");
		//Sort employee name based on alphabetical order in descending order.
		sortDescUsingEmployeeName(l1);
	}
	private static void sortDescUsingEmployeeName(List<Employee1> l12) {
		List<Employee1> collect = l12
		.stream()
		.sorted(Comparator.comparing(Employee1::getName).reversed())
		.collect(Collectors.toList());
		collect.forEach(x->System.out.println(x));
		
	}
	private static void sumTotal_Salary(List<Employee1> l12) {
		Double totalSum_Salary = l12
				.stream()
				.collect(Collectors
				.summingDouble(Employee1::getSalary));
		System.out.println(totalSum_Salary);
	}
	private static void secondHighest_salary(List<Employee1> l12) {
		Employee1 ndHighest = l12
		.stream()
		.sorted(Comparator
		.comparing(Employee1::getSalary)
		.reversed())
		.skip(1)
		.distinct()
		.findFirst()
		.get();
		System.out.println(ndHighest);
		}
	
	private static void salaryInAsecending(List<Employee1> l12) {
		List<Employee1> collect = l12
		.stream()
		.sorted(Comparator.comparing(Employee1::getSalary).reversed())
		.collect(Collectors.toList());
		collect.forEach(x->System.out.println(x));
		}
	
	
}
