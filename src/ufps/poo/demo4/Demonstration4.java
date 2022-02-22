package ufps.poo.demo4;

public class Demonstration4 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-4. Testing constructor calling sequence***");
		
		Grandchild4 grandChild = new Grandchild4(4);
		
		// 1) Se imprime algo aparte del Demostration-4.
		// 2) Qué se imprimiría?
		
		// Julian: Se imprime el letrero de Nieto.
		// Vladimir: Nieto, Hijo y Padre
		// Elvin: No tiene impresión
	}

}

/*
Inside Parent Constructor.
Inside Child Constructor.
Inside GrandChild Constructor.
*/ 
