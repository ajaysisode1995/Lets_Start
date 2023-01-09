package java_sequential_and_Parellel_Stream;

import java.util.List;

public class TestBothCase {
	public static void main(String[] args) {
		/**
		 * Sequential Stream is used to process of one core of CPU that is 
		 * on same processing system.
		 * Output is Predictable
		 */
		System.out.println("Sequential Stream");
			List<Integer> of = List.of(1,2,3,4);
			of
			.stream()
			.sequential()
			.forEach(x->System.out.println(x+" "+Thread.currentThread().getName()));
		
  /**
	* Parallel Stream is used to process of multi core of CPU in which objects
	* object are pipe lined in the multi processing system
	* In parallel Stream output is unpredictable
	*/
			System.out.println("\n");
			System.out.println("Parellel Stream");
			List<Integer> of1 = List.of(1,2,3,4);
	of1
	.parallelStream()
	.forEach(x->System.out.println(x+"::"+Thread.currentThread().getName()));
	}
}
