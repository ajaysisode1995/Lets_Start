package typical_Programms;

public class BuisnessLOgic1_100_Second {
	public static void main(String[] args) {
		
		printNumber(100);
	}

	private static void printNumber(int i) {
		if (i>0) {
			printNumber(i-1);
			System.out.print(i+" ");
		}
		
	}
}
