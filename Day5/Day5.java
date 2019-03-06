package day5;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i < 11; i++) {
            int result = n * i;
            System.out.print(n);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");                    
            System.out.println(result);
        }
        scanner.close();
    }
}
