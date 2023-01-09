package string_manipulation_java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringAndCollectToStringtoList {
	
	public static void main(String[] args) {
		String fruits = "Grapes, Apple, Mango, Banana, Orange, Melons,Strowberry,Pineapple";
		
		List<String> collect = Arrays
		.stream(fruits.split("\\,"))//split on comma
		.map(str->str.trim())//remove white space
		.collect(Collectors.toList());//collect to List
		collect.forEach(x->System.out.println(x));
	}
}
