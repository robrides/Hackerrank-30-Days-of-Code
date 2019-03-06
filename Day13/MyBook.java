
package day13;


class MyBook extends Day13 {
    protected int price;
    
    public MyBook(String title, String author, int price){
        super(title, author);         
        this.price = price;
    }
    
    public void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + 
        "\nPrice: " + price);
    }
    
}
