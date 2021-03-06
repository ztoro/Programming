package financial.person;

import utils.Utils;
import financial.bank.Bank;

public class Customer {
	
 	private String name;
	private int birthYear;
	private Bank bank;
	private int amount;
	
	private Customer(String name, int birthYear, Bank bankName) {
		this.name = name;
		this.birthYear = birthYear;
		this.bank = bankName;
		this.amount = 0;
	}
	
	public static Customer makeCustomer(String name, int birthYear, String bankName) {
		
		Bank bank;
		if (Utils.failBirthYear(birthYear) || Utils.failBankName(bankName) || Utils.failName(name)) {
			return null;
		}
		
		bank = Bank.valueOf(bankName);
		Customer newCustomer = new Customer(name,birthYear,bank);
		return newCustomer;
	}
	
	public String getName() {
		return name;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void decreaseAmount(int value) {
		amount = amount - value;
	}
	
	public void increaseAmount(int value) {
		amount = amount + value;
	}
	
	@Override
	public String toString() {
		String string;
		string = getName() + ": " + Integer.toString(getAmount());
		return string;
	}
	
}
