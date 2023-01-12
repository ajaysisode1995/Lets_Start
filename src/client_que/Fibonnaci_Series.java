package client_que;

public class Fibonnaci_Series {

	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int num3;
		int count=10;
		System.out.print(num1+" "+num2);
		for (int i = 1; i < count; i++) {
			num3=num1+num2;
			System.out.print(" ");
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	}
}
