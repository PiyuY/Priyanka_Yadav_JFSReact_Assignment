package A1BasicDataStructureAssignments;
import java.util.Scanner;  

public class Authentication {

    public static void  main(String args[]) {   
        String correctUser = "priya";    
        String correctPass = "Pass@123";
        String enteredUser = "", enteredPass="";
        int loginAttempts = 0;

        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  

        while(loginAttempts < 3){
            System.out.print("Enter Username: ");
            enteredUser = sc.nextLine();
            System.out.print("Enter Password: ");
            enteredPass = sc.nextLine();

            if(correctUser.equals(enteredUser) && correctPass.equals(enteredPass)) {
                System.out.println("Welcome " + correctUser);
                break;
            } else {
                loginAttempts++;
                if(loginAttempts == 3) {
                    System.out.println("Contact Admin");
                    break;
                }
            }
        }

    }   

}  