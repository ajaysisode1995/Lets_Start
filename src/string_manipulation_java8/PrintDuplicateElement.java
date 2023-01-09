package string_manipulation_java8;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateElement {
	public static void main(String[] args) {
		List<Integer> list = List.of(23,2,3,4,4,4,5,6,67,6);
		Set<Integer> element=new HashSet<>();
//		List<Integer> collect = list
//		.stream()
//		.filter(x->!element.add(x))
//		.collect(Collectors.toList());
//		collect.forEach(x->System.out.println(x));
		
		
		//count element
		
		Map<Integer,Long> collect2 = list
		.stream()
		.filter(x->!element.add(x))
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		collect2.forEach((x,v)->{
			if (v>1) {
				System.out.println(x+"::"+v);
			}
		});
		
		
		//
//		list
//		.stream()
//		.filter(x->!element.add(x))
//		.collect(Collectors.groupingBy(x->x,Collectors.counting()))
//		.entrySet()
//		.stream()
//		.filter(x->x.getValue()==2L)
//		.map(Map.Entry::getKey)
//		.forEach(x->System.out.println(x));
		
	}
}
