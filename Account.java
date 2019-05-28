package bacnkaccountapp;

public abstract class Account implements IBaseRate {
	//Common properties for checking and saving accounts
	private String name;
	private String ssn;
	private static int index = 10000;
	private double balance;

	protected String accountNumber;
	protected double rate;
	
	//Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposite) {
	    this.name = name;
		this.ssn = ssn;
		this.balance = initDeposite;
		
		this.accountNumber = setAccountNumber();
	}
	
	private String setAccountNumber() {
		String lastTwoDigitsOfSsn = ssn.substring(ssn.length()-2);
		int uniqueId = index;
		index++;
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));//random 3 digits number
		return lastTwoDigitsOfSsn+uniqueId+randomNumber;
		
	}
	
	public abstract void setBaseRate();
	
	//List common methods
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposited $"+amount);
		printBlance();
	}
	
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Withdrew $"+amount);
		printBlance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance-=amount;
		System.out.println("Transfered $"+amount+" to " + toWhere);
		printBlance();
	}
	
	public void printBlance() {
		System.out.println("Blanance $"+balance);
	}
	
	public void showInfo() {
		System.out.println("Name: "+name+", SSN: "+ssn+ ", Account Number: "+accountNumber +", Blanace: " + balance);
		System.out.println("Rate: " + rate +"%");
	}
	
	public void compound() {
		double accureInterest = balance * (rate/100);
		balance += accureInterest;
		System.out.println("Accure Interest: $" + accureInterest);
		printBlance();
	}
	
}
