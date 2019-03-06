package person2;

// Pointers "addresses"; Enums "preset values"; Garbage collection; JVM

import static person2.HairColor.*;

public class Person2 {

	HairColor hairColor = BLACK;
	
	public Person2() {
		
	}
	
	public static void main(String[] args){
		
		Person2 peterParker = new Person2();
		Person2 spiderMan = peterParker;
		
		peterParker.hairColor = PINK;
		
		System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
		System.out.println("Hair Color of Spiderman: " + spiderMan.hairColor);
	}
}
