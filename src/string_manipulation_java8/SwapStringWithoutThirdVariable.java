package string_manipulation_java8;

public class SwapStringWithoutThirdVariable {
	public static void main(String[] args) {
		String str1="ajay";
		String str2="vijay";
		String str3="ajaysisode";
		System.out.println(str3.length());
		
		
		
		str1=str1+str2; //ajayvijay
						//
		str2=str1.substring(0,(str1.length()-str2.length()));
	
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
}
