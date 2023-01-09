package singleTon_Pattern;

import java.io.Serializable;

public class SerizableSingleton implements Serializable {

	private static final long serialVersionUID=236577710078L;
	
	private SerizableSingleton() {
		
	}
	private static class SingleTonHelper1{
		private static SerizableSingleton instance=new SerizableSingleton();
	}
	
	public static SerizableSingleton getInstance() {
		return SingleTonHelper1.instance;
	}
//	public static void main(String[] args) {
//		System.out.println(SerizableSingleton.getInstance().hashCode());
//		System.out.println(SerizableSingleton.getInstance().hashCode());
//	}
}
