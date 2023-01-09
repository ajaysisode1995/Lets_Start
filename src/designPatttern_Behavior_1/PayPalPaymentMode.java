package designPatttern_Behavior_1;

public class PayPalPaymentMode implements PaymentMode {

	private String email;
	private String username;
	public PayPalPaymentMode(String email, String username) {
		super();
		this.email = email;
		this.username = username;
	}
	public PayPalPaymentMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public void pay(int ammount) {
		System.out.println(ammount+":::is done by using "+email);
		
	}
	
}
