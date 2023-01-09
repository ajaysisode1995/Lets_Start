package javautil_Concurrent;

import java.util.concurrent.RejectedExecutionException;

public class ExecutorTest {
	public static void main(String[] args) {
		ExcecutorImpl t1=new ExcecutorImpl();
		try {
			t1.execute(new NewThread());
		} catch (RejectedExecutionException | NullPointerException e) {
			System.out.println(e);
		}
	}
}
