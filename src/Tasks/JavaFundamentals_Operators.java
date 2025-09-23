package Tasks;

public class JavaFundamentals_Operators {

	public static void main(String[] args) {
		JavaFundamentals_Operators Demo = new JavaFundamentals_Operators();
		Demo.tc01();
		Demo.tc02();
		Demo.tc03();
		Demo.tc04();

	}

//	Operators (Arithmetic / Logical)

//	2 input from user and perform all arithmetic operations
	private void tc01() {
		int a = 10, b = 33, c, d, e, f, g;
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		System.out.println("2 input from user and perform arithemtic operations -- int");
		System.out.println("Addition value " + c);
		System.out.println("Subtraction value " + d);
		System.out.println("Multiplication value " + e);
		System.out.println("Division value " + f);
		System.out.println("Modulas value " + g);
		System.out.println("------------------");
	}

//	Repeat above Different Data types
	private void tc02() {
		double a1 = 1.89, b1 = 33.90, c1, d1, e1, f1, g1;
		c1 = a1 + b1;
		d1 = a1 - b1;
		e1 = a1 * b1;
		f1 = a1 / b1;
		g1 = a1 % b1;
		System.out.println("2 input from user and perform arithemtic operations -- double");
		System.out.println("Addition value " + c1);
		System.out.println("Subtraction value " + d1);
		System.out.println("Multiplication value " + e1);
		System.out.println("Division value " + f1);
		System.out.println("Modulas value " + g1);
		System.out.println("------------------");
	}

//	Add 100 to a number using compound assignment 
	private void tc03() {
		int a2 = 5;
		a2 += 100;
		System.out.println("Add 100 to a number using compound assignment");
		System.out.println("Added value " + a2);
		System.out.println("------------------");
	}

//	Logic with Increment and Decrement
	private void tc04() {
		int a3 = 3, b3 = 4, c3;
		c3 = a3 + b3 + a3++ + b3++ + ++a3 + ++b3;
		System.out.println("Logic with Increment and Decrement");
		System.out.println("Answer is " + c3);
		System.out.println("------------------");

	}
}
