package string_manipulation_java8;

public class SearchString {
	public static void main(String[] args) {
		String str1="abababababababa";
		String str2="ab";
		String str3="";
		
		int count=0;
		
		for (int i = 0; i < str1.length(); i++) {
			if (str1.contains(str2)) {
				count++;
				str3+=str1.replaceFirst(str2,"");
			}
		}
		System.out.println("number of repeated sequnce in string::"+str2+"::"+count);
	}
}
