package A1BasicDataStructureAssignments;
import java.util.Scanner;  

public class Results {

    public static void  main(String args[]) {       
        int marks[][] = new int[3][3];
        
        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);

        for(int i=0; i < 3; i++) {
            System.out.println("Enter Marks for Student " + (i+1));
            for(int j=0; j < 3; j++) {
                System.out.print("Subject "+ (j+1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println();


        // student total and average marks in 3 subjects
        for(int i=0; i < 3; i++) {
            System.out.println("Student " + (i+1));

            int total = 0;
            for(int j=0; j < 3; j++) {
                total += marks[i][j];
            }

            System.out.println("Total Score: " + total + "/300");
            System.out.println("Average Score: " + (total/3));
            System.out.println();
        }

        // total & average of each subject
        int totalA = marks[0][0] + marks[1][0] + marks[2][0];
        int totalB = marks[0][1] + marks[1][1] + marks[2][1];
        int totalC = marks[0][2] + marks[1][2] + marks[2][2];

        System.out.println("Subject 1:      Total= " + totalA + "        Average= " + (totalA/3));
        System.out.println("Subject 2:      Total= " + totalB + "        Average= " + (totalB/3));
        System.out.println("Subject 3:      Total= " + totalC + "        Average= " + (totalC/3));

    }   

}  
