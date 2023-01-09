package string_manipulation_java8;

public class ReverseWordsofStringTest {
	public static void main(String[] args) {
		String inputString ="Hi i am Ajay Sisode";
		 String revereseWordOfGivenString = revereseWordOfGivenString(inputString);
		 System.out.println(revereseWordOfGivenString);
	}

	private static String revereseWordOfGivenString(String inputString) {
		String[] words = inputString.trim().split("\\s+");
		String reveseCompleteString="";
		for(String str:words) {
			reveseCompleteString+=reverseEachWord(str);
		}
		return reveseCompleteString;
}

	private static String reverseEachWord(String str) {
		String str1=" ";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		return str1;
	}
}
