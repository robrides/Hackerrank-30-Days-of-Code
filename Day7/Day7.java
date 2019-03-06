
package day7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Day7 {

    private static final Scanner scanner = new Scanner(System.in);
    
   // static void reverseArray(int arr[], int start, int end){ 
      //  int temp; 
           
       // while (start < end) 
       // { 
       //     temp = arr[start];  
       //     arr[start] = arr[end]; 
       //     arr[end] = temp; 
       //     start++; 
       //     end--; 
       // } 
   // }
    
        /* Utility that prints out an 
    array on a line */
    //static void printArray(int arr[], int size){ 
        
        //for (int i = 0; i < size; i++) 
             //System.out.print(arr[i] + " "); 
          
         //System.out.println(); 
   // }  
  
    // Driver code 
    // public static void main(String args[]) { 
          
        // int arr[] = {1, 2, 3, 4, 5, 6}; 
        // printArray(arr, 6); 
        // rvereseArray(arr, 0, 5); 
        // System.out.print("Reversed array is \n"); 
        // printArray(arr, 6);  
         
    // } 
 
        
    public static void main(String[] args) {
        // TODO code application logic here
        //String rev = "";
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
           
        }
        for (int counter = n - 1; counter >= 0; counter--) {
            System.out.print(arr[counter] + " ");
        scanner.close();
        //System.out.println(rev);
        }
    }
}    

