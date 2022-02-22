package ufps.poo.demo7;

public class Demonstration7 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-7.Testing the use of super keyword.****");
		Child7 obChild = new Child7();
		obChild.showMe();
		
		// Para invocar de forma directa el método del Padre se podría hacer lo siguiente:
		Parent7 obParent = new Parent7();
	    obParent.showMe();//Now Parent class method will be invoked.
	}

}
