package com;

// Parent Class
class PClasses {

	// Declared a final Method
	public final void display() {
		System.out.println("Parent Class");
	}
}

// Child Class
public class FinalMethod extends PClasses { 

	// Declared a Method which has the same Method as the Parent extended class with "final" keyword as such it is clear that it can't be override it.
	public void display() {
		System.out.println("Child Class");
	}
	
	// Main Function
	public static void main(String args[]) {
		System.out.println("Can't run the program");
	}
}
