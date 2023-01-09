package singleTon_Pattern;

public class BillPugSingleton {

	private BillPugSingleton() {
		
	}
	private static class SingletonHelper{
		private static BillPugSingleton instance=new BillPugSingleton();
	}
	
	public static BillPugSingleton getInstance() {
		
		return SingletonHelper.instance;
	}
	public static void main(String[] args) {
		System.out.println(BillPugSingleton.getInstance().hashCode());
		System.out.println(BillPugSingleton.getInstance().hashCode());
	}
}
