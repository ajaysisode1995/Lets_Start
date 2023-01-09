package string_manipulation_java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveVovelsDemo {
	public static void main(String[] args) {
		String str1="Hi am learning spring auth2";
		
		Map<Character,Long> collect = str1
		.chars()
		.mapToObj(x->(char)x)
		.map(x->x)
		//.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		collect.forEach((x,v)->{
			if (x=='a' || x=='e' ||x=='i' ||x=='o' ||x=='u' ||x==' ') {
				
			}
			else if (x<2) {
				System.out.println(x+"::::"+v);
			}
			else {
				System.out.println(x+"::"+v);
			}
		});
	}
}
