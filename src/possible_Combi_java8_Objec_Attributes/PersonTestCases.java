package possible_Combi_java8_Objec_Attributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class PersonTestCases {
	static List<Person> list=new ArrayList<>();
	public static void main(String[] args) {
		list.add(new Person(132,"ajay", "Software Developer", "Washim", 27, 60000L));
		list.add(new Person(133,"vijay", "Testing", "Washim", 25, 50000L));
		list.add(new Person(134,"anuja", "Software Engineer", "Nashik", 25, 55000L));
		list.add(new Person(135,"Shivaji", "Quality Engineer", "Aurangabad", 28, 45000L));
		list.add(new Person(136,"kishor", "Service Now", "Mumbai", 29, 70000L));
		list.add(new Person(137,"uday", "Software Developer", "Washim", 30, 66000L));
		//sortbyAge
		m1();
		System.out.println("\n");
	}
	private static void m1() {
		System.out.println("sortbyAge");
		System.out.println("\n");
		Map<Integer,List<Person>> 
		collect = list
		.stream()
		.collect(Collectors
		.groupingBy(x->x.getAge()));
		collect.forEach((x,v)->System.out.println(x+"::"+v));
	}
}
