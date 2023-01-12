package java_8_Multi_Threading;
class Sample{
	private String s;
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public Sample(int i) {
		super();
		System.out.println("Constructor is executed::"+i);
	}
}

public class ConstructorRefDemo {
	interface Interf{
		public Sample getString(int i);
		
		public static void m1() {
			System.out.println("ajay sisode");
		}
	}
	public static void main(String[] args) {
		Interf i=s->new Sample(10);
		System.out.println(i);
		
		Runnable r=Interf::m1;
		Thread t1=new Thread(r);
		t1.start();
	}
}
