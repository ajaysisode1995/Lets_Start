package string_manipulation_java8;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintOnlyRepeatedChar {

	public static void main(String[] args) {
		String str1="Hi am learning spring auth2";
		
		Map<Character,Long> collect = str1
		.codePoints()
		.mapToObj(x->(char)x)
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		collect.forEach((x,v)->{
			if (v>1) {
				System.out.println(x+"::"+v);
			}
		});
	}
}
