package lambad_and_NoNLambda;
	
 interface Inter{
	 public void m1();
 }

public class Tes {
	
	public static void main(String[] args) {
		Inter i=()->System.out.println("ajay sisode");
		i.m1();
	}
}
