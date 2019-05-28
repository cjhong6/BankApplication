package bacnkaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankApp{
	
	public static void main(String[] args) {
		String file = "/Users/chengjiu/eclipse-workspace/JavaProject/src/bacnkaccountapp/NewBankAccounts.csv";
		List<String[]> newAccount = utilities.CSV.read(file);
		List<Account> newCustomer = new LinkedList();
		
		for(String[] account:newAccount) {
			String name = account[0];
			String ssn = account[1];
			String accountType = account[2];
			double balance = Double.parseDouble(account[3]);
			
			if(accountType.equals("Savings")) {
				newCustomer.add(new Saving(name,ssn,balance));
				
			}else if (accountType.equals("Checking")) {
				newCustomer.add(new Checking(name,ssn,balance));
			}
		}
		
		for(Account account:newCustomer) {
			account.showInfo();
			System.out.println();
		}
		
	}
}
