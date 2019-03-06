
package day8;

import java.util.*;
import java.io.*;

public class Day8 {

    public static void main(String []argh){
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Adding key-value pairs to a HashMap
            numberMapping.put(name, phone);
       }

        while(in.hasNext()){
            String s = in.next();
            int number = 0;
            if(numberMapping.get(s) != null){
                number = numberMapping.get(s);
                System.out.println(s + "=" + number);
            }else{
                System.out.println("Not found");
            }
        } 
    in.close();
    }
    
}
