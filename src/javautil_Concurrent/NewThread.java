package javautil_Concurrent;

public class NewThread implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread executed under an executor");
	}

}
