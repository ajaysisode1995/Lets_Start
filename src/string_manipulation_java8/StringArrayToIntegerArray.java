package string_manipulation_java8;

import java.util.Arrays;

public class StringArrayToIntegerArray {
	
	public static void main(String[] args) {
		String str = "1,2,356,678,3378";
		int k=3;
		
		//this is string array
		
		 String[] split =
		  str.replaceAll("\\[", "")
		 .replaceAll("]", "")
		 .replace(String.valueOf(k), "")
		 .split(",");
		 
		 
		int[] arr=new int[split.length];
		
		for (int i = 0; i < split.length; i++) {
			
				arr[i]=Integer.valueOf(split[i]);
			
		}
		
		System.out.println("string is+::"+str);
		
		System.out.println("Integer type array is::"+Arrays.toString(arr));
	}
}
