package string_manipulation_java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class PrintFirstNoNRepeatedChar
{
	public static void main(String[] args) {
		String str1="i a learning spring auth2";
		
		 Character character = str1
		.codePoints()
		.mapToObj(x->(char)x)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()==1L)
		.map(x->x.getKey())
		.findFirst()
		.get();
		  
		  System.out.println(character);
	}
}
