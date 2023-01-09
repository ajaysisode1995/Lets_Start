package typical_Programms;

public class BuisnessLogic1_100 {
	
	public static void main(String[] args) {
		printNumber(1,100);
	}

	private static void printNumber(int i, int j) {
		if (i<=j) {
			System.out.print(i+" ");
			printNumber(i+1, j);
		}
		
	}
}
