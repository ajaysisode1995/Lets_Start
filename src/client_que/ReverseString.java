package client_que;

public class ReverseString {
	public static void main(String[] args) {
		String str1="ajay sisode";
		String reveseString="";
		
		for (int i = str1.length()-1; i >=0; i--) {
			reveseString=reveseString+str1.charAt(i);
		}
		System.out.println(reveseString);
	}
}
