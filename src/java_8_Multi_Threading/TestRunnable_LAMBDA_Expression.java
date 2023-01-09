package java_8_Multi_Threading;

public class TestRunnable_LAMBDA_Expression {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("Runnable thread is executing");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread is executing");
		}
	}
}
