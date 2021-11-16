package A4ExceptionHandling.Question2;

import java.util.Scanner;

public class DivisionCustomException {

	public static void main(String[] args) {
		try {
			int num1, num2;
		
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter num 1: ");
			num1 = sc.nextInt();
		
			System.out.println("Enter num 2: ");
			num2 = sc.nextInt();
			
			if(num2==0) {
				throw new UnsupportedOperationException("Division by zero operation not allowed!");
			}
			
			double result = num1 / num2;
			System.out.println("Result is: "+result);
			
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
			
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception: " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Other Exceptions: ");
			e.printStackTrace();
		}

	}

}
