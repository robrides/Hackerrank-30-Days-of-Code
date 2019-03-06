
package day13;

import java.util.*;

abstract class Day13 {

    String title;
    String author;
    
    public Day13(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
    
    public static void main(String[] args) {
        // TODO code application logic here

    Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Day13 book = new MyBook(title, author, price);
        book.display();
    }
}
