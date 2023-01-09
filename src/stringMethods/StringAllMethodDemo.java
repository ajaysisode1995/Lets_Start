package stringMethods;

public class StringAllMethodDemo {
	public static void main(String[] args) {
		System.out.println("********SubString************");
		/**
		 * Returns the substring from begin index to end-1 index.
		 */
		String s="ashoksoft";
		System.out.println(s.substring(5));//soft
		System.out.println(s.substring(3,7));//okso
		System.out.println("\n");
		
		System.out.println("********replace************");
		String s1="ababab";
		System.out.println(s1.replace('a','b'));//bbbbbb
		
		System.out.println("\n");
		
		System.out.println("********indexOf************");
		/**
		 * It returns index of 1st occurrence of the specified character if the 
		 * specified character is not 
			available then return -1
		 */
		
		String s2="saicharan";
		System.out.println(s2.indexOf('c')); // 3
		System.out.println(s2.indexOf('z')); // -1
		System.out.println("\n");
		System.out.println("********lastIndexOf************");
		/**
		 * . public int lastIndexOf(Char ch);
		 * It returns index of last occurrence of the
		 *  specified character if the specified character is not 
			available then return -1.
		 */
		String s3="arunkumar";
		System.out.println(s3.lastIndexOf('a'));//7
		System.out.println(s3.indexOf('z'));//-1
	}
}
