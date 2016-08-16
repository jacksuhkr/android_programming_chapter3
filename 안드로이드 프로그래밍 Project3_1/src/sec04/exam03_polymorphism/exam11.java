package sec04.exam03_polymorphism;

import sec04.exam02_abstract.*;

public class exam11 {
	public static void main(String args[]) {
		Animal animal;
		
		animal = new Tiger();
		animal.move();
		
		animal = new Eagle();
		animal.move();
	}
}
