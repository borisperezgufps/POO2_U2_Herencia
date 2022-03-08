package ufps.poo.demo4;

public class Grandchild4 extends Child4 {
	
	public Grandchild4(int a) {
		super(a);
		// Invoca al constructor por defecto del padre
		System.out.println("Inside GrandChild Constructor.");
	}

	// 1) Se genera error?
	// Julian, no hay error
	// Kenn, sí funciona
	// Marlon, sí funciona 
	
	// ...
}
