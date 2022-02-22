package ufps.poo.demo5;

public class Demonstration5 {

	public static void main(String[] args) {
		
		System.out.println("***Demonstration-5. The uses of the 'super' keyword Demo***");
		Child5 obB2 = new Child5(1, 2, 3);
		
		// System.out.println("a in ObB2=" + obB2.a);//Error:a is private
		// //System.out.println("b in ObB2=" + obB2.b);//Error:b is private
		// //System.out.println("c in ObB2=" + obB2.c);//Error:c is private
		
		obB2.child5Method();
	}
	
	/*
	  	***Demonstration-5. The uses of the 'super' keyword Demo***
		======================================
		I am in parent constructor.
		Before setting,a=0
		Before setting, b=0
		Setting the values for instance variables a and b.
		Now a=1
		Now b=2
		======================================
		I am in child constructor.
		Before setting, c = 0
		Now c=3
		======================================
		I am a child method.
		I am calling the parent method.
		======================================
		I am a parent method.
		
		======================================
		I am a child method.
		I am calling the parent method.
		======================================
		I am a parent method.

	 */

}
