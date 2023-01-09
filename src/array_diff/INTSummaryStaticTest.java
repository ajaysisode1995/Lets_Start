package array_diff;

import java.util.IntSummaryStatistics;

public class INTSummaryStaticTest {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		IntSummaryStatistics i1=new IntSummaryStatistics();
	 
		for(int i:arr) {
			i1.accept(i);
		}
		long sum = i1.getSum();
		System.out.println(sum);
	}
}
