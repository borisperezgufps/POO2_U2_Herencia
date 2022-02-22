package ufps.poo.demo5;

public class Child5 extends Parent5 {
	
	private int c;

	public Child5(int a, int b, int c) {
		// Llamado a constructor por defecto
		
		// Error:Constructor call must be the first statement in a //constructor
		// System.out.println("Before setting,c="+ this.c); 
		super(a, b); // <-- Esto debe ser lo primero
		
		System.out.println("======================================");
		System.out.println("I am in child constructor.");
		System.out.println("Before setting, c = " + this.c); // Esto lanzará error?
		
		this.c = c;
		System.out.println("Now c=" + this.c);
		
	}
	
	// Y si no se invocara el super, de qué manera se podrían inicializar las variables?

	void child5Method() {
		System.out.println("======================================");
		System.out.println("I am a child method.");
		System.out.println("I am calling the parent method.");
		
		parent5Method();		
		
		
		// Juan Pablo, sale error.
		// Julian, sí sirve
		// Jarlinn, sale error.
		
	}
	
	void parent5Method() {
		System.out.println("======================================");
		System.out.println("I am a child method.");
		super.parent5Method();
	}
	

}
