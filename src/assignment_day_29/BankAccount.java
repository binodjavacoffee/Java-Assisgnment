package assignment_day_29;

public class BankAccount {
	/*
	 * Create a class BankAccount with methods to withdraw funds, deposit funds,
	 * display account information such as account number and balance The user can
	 * open a bank account providing the following information: • name and initial
	 * balance • name only (initial balance set to 0 in that case) Account number
	 * should be assigned in the constructor based on the value in the static field
	 * of the class. Overload the withdraw method with one that also takes a fee and
	 * deducts that fee from the account. Overload the deposit method with one that
	 * also takes an interest and increases all the balance in the account by that
	 * percent. After every transaction account number and balance should be
	 * displayed. In the main method create several BankAccount objects for testing
	 * purposes, deposit and withdraw funds from them in all possible ways.
	 */ 
	private String name;
	private double initialBalance;
	private int accountNum;
	private static int accountNumber=1000;
	
	public BankAccount(String name) {
		this.name=name;
		this.initialBalance=600;
		this.accountNum=accountNumber++;
		displayInfo();
		
	}
	
	
	public BankAccount(String name, double initialBalance) {
		this.name=name;
		this.initialBalance=initialBalance;
		this.accountNum=accountNumber++;
		displayInfo();
		
	}
	
	 public void depositFunds(double amount) {
		 initialBalance=initialBalance+amount;
		 displayInfo();
		 
	 }
	 public void depositFunds(double amount, double interest) {
		 initialBalance=initialBalance+amount;
		 initialBalance=initialBalance+(initialBalance*interest/100);
		 displayInfo();
		
	 }
	 public void withdrawFund(double amount) {
		 initialBalance=initialBalance- amount;
		 displayInfo();
		 
	 }
	 public void withdrawFund(double amount , double fee) {
		 initialBalance=initialBalance-amount-fee;
		 displayInfo();
		 
	 }
	 public void displayInfo() {
		 System.out.println("=========================");
		 System.out.println("Account Name : \t "+ name);
		 System.out.println("Account Number: \t "+accountNum);
		 System.out.println("Balance : \t "+"\t"+ initialBalance);
		 System.out.println("=========================");
	 }
	}
