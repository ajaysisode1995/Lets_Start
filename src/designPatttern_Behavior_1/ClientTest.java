package designPatttern_Behavior_1;

import java.util.List;

public class ClientTest {
	public static void main(String[] args) {
		
		ShoppingCart sCart=new ShoppingCart();
		
		List<Product> list = List.of(new Product("doll","fshkfdj", 100),
			    new Product("shoose", "GJg", 2000),
			    new Product("pen", "fhf", 200));
		sCart.addListOfProduct(list);
		
//		Product p1=new Product("doll","fshkfdj", 100);
//		Product p2=new Product("shoose", "GJg", 2000);
//		Product p3=new Product("pen", "fhf", 200);
//		sCart.addProduct(p1);
//		sCart.addProduct(p2);
//		sCart.addProduct(p3);
		
		//credit card payment mode
		sCart.payment(new CreditCardPaymentMode("ajay Sisode", "sbi", "567", "sghj"));
	}
}
