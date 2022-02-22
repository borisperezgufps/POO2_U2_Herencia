package ufps.poo.demo1;

public class Demonstration1 {

	/**
	 * Comprobación de invocación de métodos heredados
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Testing Inheritance.***");
		
		// Creating a ChildClass object
		ChildClass child1 = new ChildClass();
		
		// Invoking showParentMethod() through ChildClass object
		child1.showParentMethod();
	}

}

/*
***Demonstration-1.Testing Inheritance.***
I am a Parent Class method.
*/