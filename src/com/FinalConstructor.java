package com;

public class FinalConstructor {
	// Constructor declared with "final" keyword
	final FinalConstructor(){	// It shows the Compilation time error as we can't have final constructor
		
	}
	
	//	Main Function
	public static void main(String args[]) {
		FinalConstructor constructor = new FinalConstructor();	// Creating a new object of the class which inturn calls the constructor
		System.out.println("Can't run the program");
	}
}
