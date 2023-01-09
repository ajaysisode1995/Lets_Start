package java_8_Multi_Threading;

public class TestThread_Lambda_Expression {
	public static void main(String[] args) {
		Thread t=new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("runnable thread");
			}
		});
		t.start();
		//t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}
}
