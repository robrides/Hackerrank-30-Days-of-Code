
package day10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String bin[] = Integer.toBinaryString(n).split("0+");
        Arrays.sort(bin);
        System.out.println(bin[bin.length-1].length());
        scanner.close();
        /* As submitted but above is more efficient
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String str = (Integer.toBinaryString(n));
            String[] arrOfStr = str.split("0"); 
            int count=0;
                       
            for (int i=0; i<arrOfStr.length; i++){ 
                if(count < arrOfStr[i].length()){
                    count = arrOfStr[i].length();
                }
            }
            System.out.println(count); 
        scanner.close();
*/
    }
    
}
