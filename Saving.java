package bacnkaccountapp;

public class Saving extends Account{
	//List properties specific to saving account 
	private int safetyDepositeBoxID;
	private int safetyDepositeBoxKey;
	
	//Constructor to initialize saving account
	public Saving(String name, String ssn, double initDeposite) {
	 	super(name, ssn, initDeposite);
	 	accountNumber = "2"+accountNumber;
	 	safetyDepositeBox();
	 	setBaseRate();
	}
	
	private void safetyDepositeBox() {
		this.safetyDepositeBoxID = (int)(Math.random()*Math.pow(10, 3));
		this.safetyDepositeBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	
	//Lists properties specific to saving account 
	public void showInfo() {
		System.out.println("*Saving account*:");
		super.showInfo();
		System.out.println("Safety Deposite Box ID: " + safetyDepositeBoxID);
		System.out.println("Safety Deposite Box Key: " + safetyDepositeBoxKey);
	}
	
	@Override
	public void setBaseRate() {
		rate = getBaseRate()-0.25;
	}
}
