package ufps.poo.demo6;

public class Child6 extends Parent6 {

	int myInt;// this will hide myInt in Parent6

	Child6() {
		System.out.println("Initially, the value of myInt in parent class=" + super.myInt);
		System.out.println("Setting the new value( 12) of myInt in parent class now.");
		super.myInt = 12;	// Setting myInt in parent class System.out.println("Setting the value (50) of
							// myInt in child class now.");
		myInt = 50;			// Setting myInt in child class
	}

	void display() {
		System.out.println("The value of myInt in parent class=" + super.myInt);
		System.out.println("The value of myInt in child class=" + myInt);
	}

	void invokeParentMethod() {
		System.out.println("Invoking the parent class method from the child class.");
		super.parentClassMethod();
	}

}
