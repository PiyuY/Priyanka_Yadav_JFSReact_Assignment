package A1BasicDataStructureAssignments;
import java.util.Scanner;  

public class Grading {

    public static void  main(String args[]) {     
        int m1, m2, m3;  

        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  

        System.out.print("Subject 1 Marks: ");  
        m1 = sc.nextInt(); 
        System.out.print("Subject 2 Marks: ");  
        m2 = sc.nextInt(); 
        System.out.print("Subject 3 Marks: ");  
        m3 = sc.nextInt(); 

        if(m1 > 60 && m2 > 60 && m3 > 60) {
            System.out.println("Passed!");
        } else if ( (m1 > 60 && m2 > 60) || (m2 > 60 && m3 > 60) || (m3 > 60 && m1 > 60) ) {
            System.out.println("Promoted!");
        } else {
            System.out.println("Failed!");
        }
    }   

}  