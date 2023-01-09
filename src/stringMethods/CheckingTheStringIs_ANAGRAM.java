package stringMethods;

import java.util.Arrays;

public class CheckingTheStringIs_ANAGRAM {
	
	public static void main(String[] args) {
		String firstString = "Army";
		 String secondString = "mary";
		 
		 System.out.println("here the given string is anagram::"+isAnagram(firstString,secondString));;
	}

	private static boolean isAnagram(String firstString, String secondString) {
		char[] ch1 = firstString.toLowerCase().toCharArray();
		char[] ch2 = secondString.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
		
		
	}
}
