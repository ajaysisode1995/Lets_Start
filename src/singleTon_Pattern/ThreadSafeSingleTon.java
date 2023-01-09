package singleTon_Pattern;

public class ThreadSafeSingleTon {
	
	/**
	 * To avoid this extra overhead every time, double-checked locking principle is
	 *  used. In this approach, the synchronized block is used inside the if condition
	 *   with an additional check to ensure that only one instance of a singleton
	 *    class is created.
	 */
	private static ThreadSafeSingleTon instance;
	
	private ThreadSafeSingleTon() {
		
	}
	public static ThreadSafeSingleTon getInstance() {
		if (instance==null) {
			
			synchronized (ThreadSafeSingleTon.class) {
				if (instance==null) {
					instance=new ThreadSafeSingleTon();
				}
			}
		}
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(ThreadSafeSingleTon.getInstance().hashCode());
		System.out.println(ThreadSafeSingleTon.getInstance().hashCode());
	}
	
}
