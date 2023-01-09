package lambad_and_NoNLambda;

import java.util.Arrays;

public class WithOutLambda_arry
{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
//		int sum2 = Arrays.stream(arr).sum();
//		System.out.println(sum);
	}
}
