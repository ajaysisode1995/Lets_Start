package java_8_Multi_Threading;



public class TestWithThreadClass {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println("child thread having include run method");
				}
			}
		});
		t.start();
		for(int i=0;i<=5;i++) {
			System.out.println("main thread executing");
		}
		
	}
}
