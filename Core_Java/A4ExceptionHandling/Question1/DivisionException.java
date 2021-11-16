package A4ExceptionHandling.Question1;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		try {
			int num1, num2;
		
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter num 1: ");
			num1 = sc.nextInt();
		
			System.out.println("Enter num 2: ");
			num2 = sc.nextInt();
			
		
			double result = num1 / num2;
			System.out.println("Result is: "+result);
			
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception: " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Other Exceptions: ");
			e.printStackTrace();
		}

	}

}
