package ufps.poo.demo4;

public class Child4 extends Parent4 {
	
	// Implicit super constructor Parent4() 
	// is undefined. Must explicitly invoke another constructor
	public Child4(int ab) {
		super(ab);
		System.out.println("Inside Child Constructor.");
	}
	
	@Override
	public void calcular() {
//		super.calcular();
		System.out.println("Pero se puede hacer así.");				
	}
	
	public static void main(String[] args) {
		Child4 child = new Child4(8);
		child.calcular();
		// Esto se calcula así
		// Pero se puede hacer así.
	}

}
