package string_manipulation_java8;

import java.util.Arrays;

public class SplitStringEqualParts {
	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOP";
		int chunkSize = 5;
		
//		String[] split = s.split(s,chunkSize);
//		System.out.println(Arrays.toString(split))

		 String[] split = s.split("(?<=\\G.{"+chunkSize+"})");
		 System.out.println(Arrays.toString(split));
	}
}
