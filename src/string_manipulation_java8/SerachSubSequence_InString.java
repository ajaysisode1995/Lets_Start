package string_manipulation_java8;

public class SerachSubSequence_InString {

	public static void main(String[] args) {
		String str1="abababababababa";
		String str2="aba";
		
		
		int countSubsequenc = countSubsequenc(str1,str2);
		
		System.out.println("Number of repeated subsequence::"+str2+"::"+countSubsequenc);
		System.out.println(str1.toUpperCase());
		
	}

	private static int countSubsequenc(String str1, String str2) {
		if (str1.contains(str2)) {
			return 1+countSubsequenc(str1.replaceFirst(str2, ""), str2);
		}
		return 0;
	}
}
