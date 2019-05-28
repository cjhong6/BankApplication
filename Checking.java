package bacnkaccountapp;

public class Checking extends Account {
	//List properties specific to checking account 
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account
	public Checking(String name, String ssn, double initDeposite) {
		super(name,ssn,initDeposite);
		accountNumber = '1' + accountNumber;
		setDebitCard();
		setBaseRate();
	}
	
	
	
	//Lists properties specific to checking account 
	private void setDebitCard() {
		this.debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		this.debitCardPin = (int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("*Checking account*:");
		super.showInfo();
		System.out.println("Debit Card Number: " + debitCardNumber);
		System.out.println("Debit Card PIN: " + debitCardPin);
	}
	
	@Override
	public void setBaseRate() {
		rate = getBaseRate()*0.15;
	}


}
