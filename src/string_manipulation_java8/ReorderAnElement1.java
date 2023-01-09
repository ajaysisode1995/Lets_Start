package string_manipulation_java8;

public class ReorderAnElement1 {
	public static void main(String[] args) {
		 int [] arr= {3,1,5,2,7};
		 int firstStore=0;
		 int reverseforStore=0;
		 
		for (int i = 0; i < arr.length; i++) {
			if (i%2 !=0) {
				firstStore++;
			}
		}
		 int[] results=new int[firstStore];
	   for (int i = 0; i < arr.length; i++) {
			 if (i%2 !=0) {
					results[reverseforStore++]=arr[i];
				}
		 }
		 for (int i = 0; i < arr.length; i++) {
			 if (i%2!=0) {
				System.out.print(results[--firstStore]+",");
			}
			 else {
				System.out.print(arr[i]+",");
			}
		 }
	}
}
