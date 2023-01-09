package string_manipulation_java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Max_Occuring_String_Element {
	public static void main(String[] args) {
		List<String> list = 
				Arrays.asList
	("pineapple", "orange", "pineapple", "guava", "apple", "orange", "apple", "apple");
		
		 Set<String> collect = list
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()==3L)
		.map(x->x.getKey())      //its similer to map(Map.Entry::getKey)
		.collect(Collectors.toSet());
		 
		 collect.forEach(x->System.out.println(x));
		 
	}
}
