package Fundamentals;

public class OopsConceptsTask03 extends OopsConceptsTask04 {

//	Task - 3
	public static void Parent() {
		int a = 5;
		int b = 10;
		System.out.println("Parrent class calculation, Addition of 2 values --- " + (a + b));

	}

//	Task - 4
	public int Substract(int a, int b) {
		return a - b;

	}

//	Task - 5
	String message;

	public OopsConceptsTask03(String msg) {
		message = msg;

	}

	public void showMessage() {
		System.out.println("Message : " + message);

	}

}
