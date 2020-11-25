package assignment_day_29;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount binod= new BankAccount("Binod Shrestha");
		binod.depositFunds(2500);
		binod.withdrawFund(300);
		//binod.displayInfo();
		
		BankAccount binod1 = new BankAccount("Shrestha Binod",5000) ;
		binod1.withdrawFund(600);
		binod1.depositFunds(3000);
		//binod1.displayInfo();
		
		
		binod.depositFunds(1000);
	}
	}

