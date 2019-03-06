
package day14;


public class Difference extends Day14 {
    
    // private int[] elements;
    //public int maxDifference;
        
    public Difference(int a[]){
        this.elements = a;        
    }
    
    public int computeDifference() {
        maximumDifference = Math.abs(elements[0] - elements[1]);
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (Math.abs(elements[j] - elements[i]) > maximumDifference)
                    maximumDifference = Math.abs(elements[j] - elements[i]);
            }
        }
        return maximumDifference;
    }    
}
