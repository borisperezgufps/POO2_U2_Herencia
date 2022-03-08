package ufps.poo.demo2;

public class Demostration2 {

	/**
	 * Comprobacion de miembros privados a través de herencia
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("***Demonstration-2.Private members are also inherited***");
		
		B obB = new B();
		A obA = new A();
		// This is a proof that a is also inherited. See the error //message.
		
		obB.telefono = 233222234;
//		obB.setTelefono(233222234);
		obB.setA(5);
		System.out.println(obB.getA());
		
		// ***Demonstration-2.Private members are also inherited***
		// 5
		
		System.out.println(obA.a);		
		System.out.println(obB.a);
		
//		System.out.println(obA.b);		
//		System.out.println(obB.b);
		
		// Por qué se genera error en las líneas 16 y 17?
		// Es diferente del error que se genera en las líneas 19 y 20?
		// De qué otra manera se puede comprobar que sí se está heredando el miembro privado?
		
		
	}

}
