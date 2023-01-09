package java_8_Multi_Threading;

public class TestWith_Method_Reference {
	private static void m1() {
		for(int i=0;i<5;i++) {
			System.out.println("static method reference");
		}
	}
	public static void main(String[] args) {
		Runnable r=TestWith_Method_Reference::m1;
		//r.run();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread running");
		}
	}
}
