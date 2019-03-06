
package animal;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// Inheritance, reusability
// Superclass, subclass; Object in Java is a superclass.  Here we created
// the superclass Animal and subclasses Dog and Cat
//  Object
//    |
//  Animal
//   |   |
// Dog  Cat

public class Animal {

    private int age; // Public vs. private variables
    
    // Constructor
    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }
    
    // f(x) = x + 5
    // f(z, d) = z + d
    // x is only accessible in first line; z and d only accessible in second
    // line.  Below the thing is only accessible in the doSomething() method, 
    // it's not accessible outside of it's SCOPE.
    public void doSomething(String thing) {
        System.out.println("I'm doing " + thing);
    }
    
    public void eat() {
        System.out.println("An animal is eating");
    }
    
    public int getAge() {
        return age; // oneway in and oneway out so you can control what is 
                    // changing the variable
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal(5);
        Dog d = new Dog();        
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.getAge());
        c.meow();
        System.out.println(c.getAge());
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        
        // What happens if...
        //Animal o = new Dog();
        
    }
    
}
