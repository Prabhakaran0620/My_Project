package Fundamentals;

public class OopsConceptsTask02 extends OopsConceptsTask03 {

//	Task 3: Write a Java Program
//	 
//	a) Two different classes should be defined and one class has to be inherited on the other.
//	b) Both the class should contain same method name.
//	c) call the method without creating the object.

	public static void child() {
		int a = 5;
		int b = 10;
		System.out.println("Child class calculation, Multiplication of 2 values --- " + (a * b));

	}

//	Task 4: Write a Java Program
//	 
//	a) Three different classes should be defined and A should be inheited in B  & B should be inheited in C
//	b) All class should contain different method name should return values with formal parameter
//		ex: public int display (int a, int b)
//		
//	c) call the method via object with actual parameter.
//		Ex: int s=obj.display(5,6)

	public int add(int a, int b) {
		return a + b;

	}

//	Task 5 : Write a Java Program
//	 
//	a) Two different classes should be defined and one class has to be inherited on the other.
//	b) Define a constructor in parent class. With the help of constructor , initialize variables in parent class.
//  c) call the "display" method via object .

	public OopsConceptsTask02(String message) {
		super(message);
	}

	public static void main(String[] args) {

//		Task - 3
		System.out.println("Oops Concept Task 03  ");
		OopsConceptsTask03.Parent();
		OopsConceptsTask02.child();
		System.out.println("---------------------------------");

//		Task - 4
		OopsConceptsTask02 obj = new OopsConceptsTask02(" Parent class method through Obj ");
		System.out.println("Oops Concept Task 04  ");
		System.out.println("Child class method --- " + obj.add(22, 13));
		System.out.println("Parent class method --- " + obj.Substract(45, 15));
		System.out.println("Grand Parent class method --- " + obj.Multiply(20, 20));
		System.out.println("---------------------------------");

//		Task - 5
		System.out.println("Oops Concept Task 05  ");
		obj.showMessage();
		System.out.println("---------------------------------");

	}

}
