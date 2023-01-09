package string_manipulation_java8;



public class CountCharAnd_Times {
	public static void main(String[] args) {
		String inputString = "coderolls";
		char c='o';
		int count=0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i)==c) {
				count++;
			}
		}
		
		System.out.println("Number of repeating times of char::"+c+"::"+count);
	}
}
