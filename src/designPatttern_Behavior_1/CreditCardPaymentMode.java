package designPatttern_Behavior_1;

public class CreditCardPaymentMode implements PaymentMode{

	private String cardHoldeName;
	private String card;
	private String cvv;
	private String dateOfExpirary;
	public CreditCardPaymentMode(String cardHoldeName, String card, String cvv, String dateOfExpirary) {
		super();
		this.cardHoldeName = cardHoldeName;
		this.card = card;
		this.cvv = cvv;
		this.dateOfExpirary = dateOfExpirary;
	}
	public CreditCardPaymentMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCardHoldeName() {
		return cardHoldeName;
	}
	public void setCardHoldeName(String cardHoldeName) {
		this.cardHoldeName = cardHoldeName;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getDateOfExpirary() {
		return dateOfExpirary;
	}
	public void setDateOfExpirary(String dateOfExpirary) {
		this.dateOfExpirary = dateOfExpirary;
	}
	@Override
	public void pay(int ammount) {
		System.out.println(ammount+"==is done by using=="+card);
	}
	
}
