package Tasks;

public class ConditionalStatements {

	public static void main(String[] args) {

		ConditionalStatements IfTask = new ConditionalStatements();
		IfTask.tc01();
		IfTask.tc02();
		IfTask.tc03();
		IfTask.tc04();
		IfTask.tc05();
		IfTask.tc06();
		IfTask.tc07();

	}

//	Task 1: Even or Odd
	private void tc01() {
		int a = 5784;
		if (a % 2 == 0) {
			System.out.println(a + " is an Even number");
		} else {
			System.out.println(a + " is an Odd number");
		}
	}

//	Task 2: Find the Greatest of Two Numbers
	private void tc02() {
		int a = 20982082, b = 8293829;
		if (b > a) {
			System.out.println(b + " = b is not greater than a");

		} else {
			System.out.println(a + " = a is greater than b");
		}
	}

//	Task 3: Positive, Negative, or Zero
	private void tc03() {
		int a = 0;
		if (a == 1) {
			System.out.println(a + " = a is Positive");
		}

		else if (a == -1) {
			System.out.println(a + " = a is negative");
		}

		else {
			System.out.println(a + " = a is Zero");
		}

	}

//	Task 4: Grade Calculator
	private void tc04() {
		int marks = 75;
		if (marks >= 90 && marks <= 100) {
			System.out.println("A Grade");
		}

		else if (marks >= 80 && marks <= 89) {
			System.out.println("B Grade");
		}

		else if (marks >= 70 && marks <= 79) {
			System.out.println("C Grade");
		}

		else if (marks >= 60 && marks <= 69) {
			System.out.println("D Grade");
		}

		else if (marks <= 59) {
			System.out.println("Fail");
		}

		else {
			System.out.println("Invalid Marks");
		}
	}

//	Task 5: Day of the Week
	private void tc05() {
		int dayValue = 2;
		switch (dayValue) {

		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wednesday");
			break;

		case 5:
			System.out.println("Thrusday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid DayValue");

		}

	}
	
//	Write a code for prime number between 400 to 700
	private void tc06() {
		System.out.println("Prime number between 400 to 700");
		for (int i=400; i<=700; i++) {
			if (i % 2 !=0 || i % 3 !=0) {
				System.out.println("The ans is "  + i);
				
			}
//			else if(i % 3 != 0) {
//				System.out.println("The ans is "  + i);
//
//			}
//			
		}
	}
	
//	Write the switch case to find the data types ( inputs: "A", "8", "2.11")
	private void tc07() {
//		String value = "2.11";
//		switch(value) {
//		case "1":
//			System.out.println("Int");
//			break;
//		case "a":
//			System.out.println("long");
//			break;
//		case "2.11":
//			System.out.println("Double");
//			break;
//		}
//			default :
//				System.out.println("Invalid Input");
//			
		System.out.println("Number Pattern");
		int n = 1;
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
			
		}
		
		
		
	}
	 
	
	

}
