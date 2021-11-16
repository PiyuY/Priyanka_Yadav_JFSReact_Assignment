package A10Java_11_Features.Q1SimpleInterest;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount, Rate of Interest & No. of Years: ");
		double principal=sc.nextDouble();
		double roi=sc.nextDouble();
		double years=sc.nextDouble();
		
		SimpleInterestInterface calculateSI = (a, b, c)->((a*b*c)/100);
		System.out.println("Total Interest : " + calculateSI.calculate(principal, roi, years));
	}

}
