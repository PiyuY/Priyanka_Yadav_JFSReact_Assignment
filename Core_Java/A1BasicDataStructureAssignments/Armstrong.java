package A1BasicDataStructureAssignments;

import java.util.Scanner;  
import java.lang.Math; 

public class Armstrong {  

    static void isArmStrong (int n){
        int temp, remainder, sum=0, digits=0;

        temp = n;

        // calculating no. of digits
        digits = Integer.toString(n).length();  

        // iterating number digits one by one & adding them
        while(temp > 0) {
            remainder = temp%10;
            temp = temp/10;
            sum += Math.pow(remainder, digits);
        }

        if(n == sum){
            System.out.println("Armstrong ");       
        } else {
            System.out.println("Not Armstrong "); 
        }    

    }

    public static void  main(String args[]) {     
        int num;  

        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter the number: ");  
        num = sc.nextInt(); 

        isArmStrong(num);
    }   

}  