
package day14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day14 {

    protected int maximumDifference;
    protected int[] elements;
    
    /*public int[] Difference(int a[]) {
        this.elements = a;
        return elements;
    }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
                

        Difference difference = new Difference(a);
        
        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
      
}
    

