package Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputArrayToJava {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        try {
            arr_size = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for array size. Please enter a valid integer.");
            return;
        }
 
        // Initialize the array's
        // size using user input
        int[] arr = new int[arr_size];
 
        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            try {
                arr[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for array element. Please enter a valid integer.");
                return;
            }
        }
 
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr_size; i++) {
            // prints the elements of an array
            System.out.print(arr[i] + " ");
        }
 
        // Close the BufferedReader
        br.close();
    }// TODO Auto-generated method stub

}
