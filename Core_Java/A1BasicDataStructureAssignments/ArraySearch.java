package A1BasicDataStructureAssignments;
import java.util.Scanner;  

public class ArraySearch {

    public static void  main(String args[]) {       
        int num;
        boolean isPresent = false;

        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};

        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter no. to search: "); 
        num = sc.nextInt();
        
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == num) {
                isPresent = true;
                break;
            }
        }

        if(isPresent) {
            System.out.print(num + " is present in array."); 
        } else {
            System.out.print(num + " is not present in array."); 
        }

    }   

}  