package javautil_Concurrent;

import java.util.concurrent.Executor;


public class ExcecutorImpl implements Executor{
	
	@Override
	public void execute(Runnable command) {
		
		new Thread(command).start();
		
	}
}
