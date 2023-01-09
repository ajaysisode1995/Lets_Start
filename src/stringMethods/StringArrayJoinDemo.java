package stringMethods;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArrayJoinDemo {
	public static void main(String[] args) {
		String[] stringArray = { "My", "name", "is", "Gaurav", "!" };
		
		String joinStringByUsingCollectorsCounting = joinStringByUsingCollectorsCounting(stringArray);
		System.out.println(joinStringByUsingCollectorsCounting);
		
		usingStringJoinMethod(stringArray);
	}

	private static String usingStringJoinMethod(String[] stringArray) {
		String join = String.join("  ", stringArray);
		return join;
	}

	private static String joinStringByUsingCollectorsCounting(String[] stringArray) {
		return Arrays.stream(stringArray).collect(Collectors.joining());
	}
}
