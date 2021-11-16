package A8Lambda_Expression.Question1;

public class LambdaBasicArithmatic {

	public static void main(String[] args) {
		
		// Multiple parameters in lambda expression  
		
        BasicArithmatic add = (a,b)->(a+b);          
        System.out.println("Addition of 10 & 20 is " + add.calculate(10,20));  
        
        BasicArithmatic sub = (a,b)->(a-b);          
        System.out.println("Subtraction of 10 & 20 is " + sub.calculate(10,20)); 
        
        BasicArithmatic mul = (a,b)->(a*b);          
        System.out.println("Multiplication of 10 & 20 is " + mul.calculate(10,20)); 
        
        BasicArithmatic div = (a,b)->(a/b);          
        System.out.println("Division of 25 & 10 is " + div.calculate(25,10)); 
        
	}

}
