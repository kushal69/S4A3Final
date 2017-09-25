package com;

public class FinalVariable {	
	final int finalVariable = 100; 		//	variable declared with "final" keyword and value
	
	//	Main Function
	public static void main(String args[]){
		FinalVariable variable = new FinalVariable();	//	Created an object of the class
		
		//	Printing value of the final variable
		System.out.println("Final Variable vlaue before assigning new value ->" + variable.finalVariable);
		
		// Trying to assign new value to the final variable as a result it shows the compilation time error - as such we can know that final variable 
		// value can't be changed.
		variable.finalVariable = 200;
		
		//	Printing value of the final variable		
		System.out.println("Final Variable vlaue after assigning new value ->" + variable.finalVariable);
	}
}