package A1BasicDataStructureAssignments;
import java.util.Scanner;  

public class CalculateTax {

    static void calculateTax(double amt){
        double payableTax; 

        if (amt <= 180000) {
            // Slab A: No tax
            payableTax = 0;
        } else if(amt <= 300000) {
            // Slab B: 10% tax
            payableTax = amt * 0.10;
        } else if(amt <= 500000) {
            // Slab C: 20% tax
            payableTax = amt * 0.20;
        } else if(amt <= 1000000) {
            // Slab D: 30% tax
            payableTax = amt * 0.30;
        } else { // extra E for more than 10Lacs of income
            payableTax = amt * 0.35;
        }

        System.out.println("Tax Payable: " + payableTax);

    }

    public static void  main(String args[]) {     
        double income;  

        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  

        System.out.print("Enter your Income: ");  
        income = sc.nextInt(); 

        if(income < 0) {
            System.out.println("Enter Positive Amount!");
        } else {
            calculateTax(income);
        }

    }   

}  