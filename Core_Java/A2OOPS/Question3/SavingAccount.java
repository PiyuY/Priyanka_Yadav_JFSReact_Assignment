package A2OOPS.Question3;

public class SavingAccount extends Account{
	
	double fd = 15000;
	
	double totalCash(){
		
		cash = cash + fd;
		
		System.out.println("Total Cash in Saving Account: " + cash);
		
		return cash;

	}
}
