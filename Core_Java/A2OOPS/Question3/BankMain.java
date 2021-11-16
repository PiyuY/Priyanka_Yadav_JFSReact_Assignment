package A2OOPS.Question3;



public class BankMain {
	public static void main(String args[]) {
		Account aa;
				
		aa = new CurrentAccount();
		double currentAccountCash = aa.totalCash();
		
		aa = new SavingAccount();
		double savingAccountCash = aa.totalCash();
		
		double bankCash = currentAccountCash + savingAccountCash;
		System.out.println("Total Cash in Bank is: " + bankCash);
	}
}
