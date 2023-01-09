package typical_Programms;

public class TypicalArrayPrint {
	public static void main(String[] args) {
		int [] array= {1,2,3,4,6,5,6,7,8};
		
		int temp=0;
		
		for (int i = 1; i < array.length/2; i=i+2) {
	    	temp=array[i];
			System.out.println(array[array.length-i]);
			array[i]=array[array.length-i];
			temp=array[array.length-i];
	}
  }
}
