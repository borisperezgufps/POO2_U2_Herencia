package ufps.poo.demo9;

public class Child9 extends Parent9 {
	int b;

	Child9() {
		this(2);
		System.out.println("Invoking parameterless constructor of Child9.");
	}

	Child9(int b) {
          this.b = b;
          System.out.println("Inside Child9 constructor with one parameter where b= " + b);
          i = 6;
    }
}