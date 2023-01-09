package typical_Programms;

import java.util.ArrayList;
import java.util.List;

public class RepeatedStringSubSequence {

	public static void main(String[] args) {
		String str1="abababababababa";
		String str2="ab";
		int lastIndex=0;
		int count=0;
		
		/**
		 * Using indexof method
		 */
		System.out.println("\n");
//		System.out.println("first way");
//		while (lastIndex!=-1) {
//			lastIndex = str1.indexOf(str2, lastIndex);
//			
//			if (lastIndex!=-1) {
//				count++;
//				lastIndex+=str2.length();
//			}
//		}
//		System.out.println(count);
//		System.out.println("\n");
//		System.out.println("second way");
//		
//		//System.out.println(str1.split(str2, -1).length-1);
//		
//		System.out.println("\n");
//		System.out.println("third way");
//		List<Integer> index=new ArrayList<>();
//		
//		while ((lastIndex=str1.indexOf(str2, lastIndex))!=-1) {
//			count++;
//			index.add(lastIndex);
//			lastIndex++;
//		}
//		System.out.println("Number of repeated character::"+count);
//		System.out.println("4th way");
		int numberOfRepeated_SubSequence = numberOfRepeated_SubSequence(str1,str2);
		System.out.println("number of repeated String in string::"+str2+"::"+numberOfRepeated_SubSequence);
	}

	private static int numberOfRepeated_SubSequence(String str1, String str2) {
		if (str1.contains(str2)) {
			
			return 1+ numberOfRepeated_SubSequence(str1.replaceFirst(str2, ""),str2);
			
		}
		return 0;
	}
}
