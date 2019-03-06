
package day6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

   public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = 0; 
        String s;
        String even = "";
        String odd = "";
        
        t = scanner.nextInt();
        for (int j=0; j < t; j++){
        s = scanner.next();
        for (int i=0; i < s.length(); i++){
        
        if ((i & 1) == 0){
            even = even + s.charAt(i);
            //System.out.println(s.charAt(i));
        } else {
            odd = odd + s.charAt(i);
            //System.out.println(s.charAt(i));
            }
        }
        System.out.println(even + " " + odd);
        even = "";
        odd = "";
        }
    }
    
}
