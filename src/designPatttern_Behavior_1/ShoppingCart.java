package designPatttern_Behavior_1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Product> list = new ArrayList<>();

	public ShoppingCart(List<Product> list) {
		super();
		this.list = list;
	}

	public ShoppingCart() {
		
	}
	
	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void removeProduct(Product product) {
		list.remove(product);
	}

	public void addListOfProduct(List<Product> list1) {
		list.addAll(list1);
	}
	public int calculateProductPriceSum() {
		return list.stream().map(x->x.getPrice()).reduce(0, Integer::sum);
	}
	
	public void payment(PaymentMode paymentMode) {
		paymentMode.pay(calculateProductPriceSum());
	}
}
