package day19;

import java.io.*;
import java.util.*;
import java.util.Stack;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	Stack<Integer> sumStack = new Stack<>();
    	
    	int N = 1;
    	int sum = 0;
    	for (int i = 1; i < n; i++) {
    		if (n % N == 0) {
    			sumStack.push(N);
    		}
    		N++;
    	}
    	for (int i = sumStack.size(); i > 0; i--) {
    		int j = 0;
    			j = sumStack.pop();
    			sum = sum + j;
    	}
    	sum = sum + n;
        return sum;
    }
}

public class Solution {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
