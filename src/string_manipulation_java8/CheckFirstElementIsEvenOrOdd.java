package string_manipulation_java8;

import java.util.List;

public class CheckFirstElementIsEvenOrOdd {
	public static void main(String[] args) {
		List<Integer> list = List.of(13,2,3,4,5);
		
		list
		.stream()
		.findFirst()
		.filter(x->{
			if (x%2==0) {
				System.out.println("first element is even::"+x);
			}
			else {
				System.out.println("first element is odd::"+x);
				return true;
			}
			return false;
		});
	}
}
