package Fundamentals;

public class OopsConceptsTask01 {

	public static void main(String[] args) {

		OopsConceptsTask01 obj = new OopsConceptsTask01();

		System.out.println("Oops Concept Task 01  ");
		System.out.println("Addition of 2 Values : " + obj.add(15, 20));
		System.out.println("Concatenation of Strings : " + obj.concatenateStrings("THANK", "YOU"));
		System.out.println("Greatest Number is : " + obj.greatestNumber(6.78, 8.9));
		System.out.println("Even Number is : " + obj.checkEven(897));
		System.out.println("Character to Uppercase : " + obj.charToUppercase('w'));
		System.out.println("---------------------------------");

		System.out.println("Oops Concept Task 02  ");
		System.out.println("Same method with int datatype with addition : " + obj.display(8));
		System.out.println("Same method with String datatype wiht lowercase conversion : " + obj.display("OOPS CONCEPT"));
		System.out.println("Same method with double datatype with Multiplication : " + obj.display(8.9));
		System.out.println("Same method with char datatype with Titlecase conversion: " + obj.display('v'));
		System.out.println("Same method with Boolean datatype : " + obj.display(90 > 10, 11 < 10));
		System.out.println("---------------------------------");

	}

//	Task 1: Write a Java Program
//	 
//	a) A class should consist of five different methods.
//	b) Parameters may be of any data types.
//	c) All methods should return values which has to be printed in main method.

//	Method 1 - Addition of 2 values
	public int add(int addvalue01, int addvalue02) {
		return addvalue01 + addvalue02;

	}

//	Method 2 - Concatenate Strings
	public String concatenateStrings(String S1, String S2) {
		return S1 + S2;

	}

//	Method 3 - Find the Greatest number
	public double greatestNumber(double x, double y) {
		return x > y ? x : y;

	}

//	Method 4 - Check even
	public boolean checkEven(int num) {
		return num % 2 == 0;

	}

//	Method 5 - character to Uppercase
	public char charToUppercase(char ch) {
		return Character.toUpperCase(ch);

	}

//	Task 2: Write a Java Program
//	 
//	a) A class should consist of five same method but different parameters.
//	b) Parameters may be of any data types.
//	c) All methods should return values which has to be printed in main method.

	public int display(int a) {
		return a * 10;

	}

	public String display(String StringValue) {
		return StringValue.toLowerCase();

	}

	public double display(double d) {
		return d * 10.99;

	}

	public char display(char ch) {
		return Character.toTitleCase(ch);

	}

	public boolean display(boolean val01, boolean val02) {
		return val01 && val02;

	}

}
