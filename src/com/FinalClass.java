package com;

//	Declared a final Class
final class Classes{}

//	Declared a Class which extends Final class
public class FinalClass extends Classes{	//	Here the main use of "final" keyword can be seen as it shows the error - final classes can't be subclass.
	
	//	Main Function
	public static void main(String args[]){
		System.out.println("Can't run the program");
	}
}