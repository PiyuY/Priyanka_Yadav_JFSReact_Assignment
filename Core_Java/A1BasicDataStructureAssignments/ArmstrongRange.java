package A1BasicDataStructureAssignments;
import java.lang.Math; 

public class ArmstrongRange {  

    static void isArmStrong (int n){
        int temp, remainder, sum=0, digits=0;

        temp = n;

        // calculating no. of digits
        digits = Integer.toString(n).length();  

        while(temp > 0) {
            remainder = temp%10;
            temp = temp/10;
            sum += Math.pow(remainder, digits);
        }

        if(n == sum){
            System.out.println(n);       
        }   
    }

    public static void  main(String args[]) {     
        for(int i = 100; i <= 999; i++) {
            isArmStrong(i);
        }
    }   

}  