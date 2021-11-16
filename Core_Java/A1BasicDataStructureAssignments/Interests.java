package A1BasicDataStructureAssignments;
import java.util.Scanner;  

public class Interests {
    // interest rate 12%
    double rate = 12;
    //  total period is 5 years
    int period = 5; 
    
    // no. of interest compounded yearly
    int noOfComp = 12;

    void simpleInterest (double amt) { 
        // formula: (p * n * r) / 100
        double interest = (amt * period * rate) / 100;
        System.out.println("Simple Interest: " + interest);
    }

    void compoundInterest (double amt) { 
        // formula: p * ( (1 + r/n) ^ (n*t) )
        // rate should be in decimal if 5% then 0.05
        double interest = amt * ( Math.pow( (1 + (rate/100) / noOfComp), (period * noOfComp)) );
        System.out.println("Compound Interest: " + interest);
    }

    public static void  main(String args[]) {     
        double amt;  

        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter the amount: ");  
        amt = sc.nextDouble(); 

        Interests i = new Interests();
        i.simpleInterest(amt);
        i.compoundInterest(amt);
    }   

}  