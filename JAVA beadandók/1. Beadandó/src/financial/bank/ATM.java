package financial.bank;

import financial.person.Customer;
import main.Main;

public class ATM {
	
	Customer customer;
	
	private Bank bank;
	private int amount;
	
	public ATM(Bank bank, int amount) {
		this.bank = bank;
		this.amount = amount;
	}
	
	public ATM makeATM(String bankName,int amount) {
		if (0 > amount || Main.failBankName(bankName)) {
			return null;
		} else {
			Bank bankValue = Bank.valueOf(bankName);
			ATM newATM = new ATM(bankValue,amount); 
			return newATM;
		}
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
	
	public int calculateFee(Bank bank, int value) {
		
	}
}
