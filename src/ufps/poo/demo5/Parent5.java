package ufps.poo.demo5;

public class Parent5 {

	private int a;
	private int b;

	public Parent5(int a, int b) {
		System.out.println("======================================");
		System.out.println("I am in parent constructor.");
		System.out.println("Before setting,a=" + this.a);
		System.out.println("Before setting, b=" + this.b);
		System.out.println("Setting the values for instance variables a and b.");
		this.a = a;
		this.b = b;
		System.out.println("Now a=" + this.a);
		System.out.println("Now b=" + this.b);
	}

	void parent5Method() {
		System.out.println("======================================");
		System.out.println("I am a parent method.");
	}

}
