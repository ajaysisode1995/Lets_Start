package typical_Programms;

import java.util.Arrays;

public class ArrayMult {

	public static void main(String[] args) {
		int[] arr= {2,4,1,5};
		int temp=0;
		int[] results=new int[arr.length];
		
		while (temp<arr.length) {
			int product=1;
			for (int i = 0; i < arr.length; i++) {
				if (i==temp) {
					continue;
				}
				else {
					product*=arr[i];
				}
			}
			results[temp]=product;
			temp++;
		}
		System.out.println(Arrays.toString(results));
	}
}
