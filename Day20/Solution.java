package day20;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	static int count = 0;
	
	   static void bubbleSort(int[] arr) {
	      int n = arr.length;
	      int temp = 0;

	      for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) {
	            if(arr[j-1] > arr[j]) {
	               temp = arr[j-1];
	               arr[j-1] = arr[j];
	               arr[j] = temp;
	               count++;
	            }
	         }
	      }
	   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
