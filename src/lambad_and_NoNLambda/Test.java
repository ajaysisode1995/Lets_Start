package lambad_and_NoNLambda;

	interface Interf{
		public void sum(int a,int b);
	}
     public class Test {
		public static void main(String[] args) {
		
	Interf i=(a,b)->System.out.println("sum of varaible is ::"+(a+b));
		i.sum(10, 20);
	}

}
