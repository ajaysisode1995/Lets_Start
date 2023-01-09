package string_manipulation_java8;

public class ReverseAnString {
	public static void main(String[] args) {
		String str1="ajay sisode";
		String reverseString="";
		//without reverse method
		for (int i = str1.length()-1; i>=0 ; --i) {
			
			reverseString+=str1.charAt(i);
		}
		System.out.println("ReverseString is::"+reverseString);
	}
}
