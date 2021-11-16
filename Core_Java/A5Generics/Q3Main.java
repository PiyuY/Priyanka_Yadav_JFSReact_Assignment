package A5Generics;
import java.util.Arrays;

// Generic Method to swap(exchange position) two elements in the array 
public class Q3Main {

    public static void swapElements(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // swapping elemets in integer array
        Integer[] arr1 = {1, 2, 3, 4};
        System.out.println("Before Swapping: " + Arrays.toString(arr1));
        swapElements(arr1, 0, 3);
        System.out.println("After Swapping 0th element with 3rd: " + Arrays.toString(arr1));

        // swapping elemets in String array
        String[] arr2 = {"1", "2", "3", "4"};
        System.out.println("Before Swapping: " + Arrays.toString(arr2));
        swapElements(arr2, 1, 2);
        System.out.println("After Swapping 1st element with 2nd: " + Arrays.toString(arr2));
    }
}