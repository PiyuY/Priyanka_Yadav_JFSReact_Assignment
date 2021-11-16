package A2OOPS.Question3;

public class CurrentAccount extends Account{
	
	double credit = 10000;
	
	double totalCash(){
		cash = cash - credit;
		
		System.out.println("Total Cash in Current Account: " + cash);
		
		return cash;
	}
}

