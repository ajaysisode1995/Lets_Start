package immutable_Program;



final public class MyImmutable {
	private final int i;

	public MyImmutable(int i) {
		super();
		this.i = i;
	}
	
	public MyImmutable modify() {
		if(this.i==i)
			return this;
			else
				return new MyImmutable(i);
	}
	
	public static void main(String[] args) {
		
	}
}
