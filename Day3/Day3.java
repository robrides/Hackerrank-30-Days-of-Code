package day3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N < 1){
            System.out.println("Invalid, less than 1");
        }
        if (N > 100) {
            System.out.println("Invalid, greater than 100");
        }
        if (N % 2 != 0){
            System.out.println("Weird");
        }
        if (N % 2 == 0 && N>1 && N<6) {
            System.out.println("Not Weird");
        } 
        if (N % 2 == 0 && N>5 && N<21) {
            System.out.println("Weird");            
        }
        if (N % 2 == 0 && N>20) {
            System.out.println("Not Weird");
        }
                    
        
        scanner.close();
    
    

    }
}                  