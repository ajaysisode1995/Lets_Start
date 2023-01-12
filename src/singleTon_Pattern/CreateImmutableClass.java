package singleTon_Pattern;

final public class CreateImmutableClass {

	final private int i;

	public CreateImmutableClass(int i) {
		this.i = i;
	}

	public CreateImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		}

		else {
			return new CreateImmutableClass(i);
		}
	}
	
	public static void main(String[] args) {
		CreateImmutableClass c1=new CreateImmutableClass(100);
		CreateImmutableClass c2=c1.modify(10);
		CreateImmutableClass c3=c1.modify(100);
		CreateImmutableClass c4=c1.modify(100);
		
		System.out.println("ajay sisode");
		System.out.println(c3==c4);
		System.out.println(c1==c2);
	}

}
