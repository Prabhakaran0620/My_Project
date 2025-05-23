package Tasks;

import java.util.Scanner;

public class PatternSamples {

	private Scanner scanner;

	public PatternSamples(Scanner scanner) {
		this.scanner = scanner;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		PatternSamples demo = new PatternSamples(scanner);
//		demo.pattern01();
//		demo.pattern02();
//		demo.pattern03();
//		demo.pattern04();
//		demo.pattern05();
//		demo.pattern06();
//		demo.pattern07();
		demo.pattern08();

	}

//	Pattern - 01 : Square Fill Pattern - Star
//	
//	*****
//	*****
//	*****
//	*****
//	*****

	private void pattern01() {

		System.out.println("Pattern - 01 : Square Fill Pattern - Star");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				System.out.print("*" + " ");

			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");

	}

//	Pattern - 02 : Square Fill Pattern - Number
//	
//	11111
//	22222
//	33333
//	44444
//	55555

	private void pattern02() {

		System.out.println("Pattern - 02 : Square Fill Pattern - Number");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				System.out.print(i + " ");

			}
			System.out.println(" ");

		}
		System.out.println("---------------------------");

	}

//	Pattern - 03 : Right Half Pyramid (No of Rows = No of Columns)
//	
//	*
//	**
//	***
//	****
//	*****

	private void pattern03() {

		System.out.println("Pattern - 03 : Right Half Pyramid");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");

			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	
//	Pattern - 04 : Number Increasing pyramid
//	
//	1
//	12
//	123
//	1234
//	12345
	
	private void pattern04() {

		System.out.println("Pattern - 04 : Number Increasing pyramid");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	
//	Pattern - 05 : Zero One Triangle
//	
//	1
//	01
//	101
//	0101
//	10101
	
	private void pattern05() {

		System.out.println("Pattern - 05 : Zero One Triangle");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			
			int printValue = i % 2==0 ? 0 : 1 ;

			for (int j = 1; j <= i; j++) {
				System.out.print(printValue + " ");
				printValue = 1 - printValue ;

			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	
//	Pattern - 06 : Number Changing Pyramid
//	
//	1
//	2 3
//	4 5 6
//	7 8 9 10
//	11 12 13 14 15
	
	private void pattern06() {

		System.out.println("Pattern - 05 : Number Changing Pyramid");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();
		int printValue = 1;
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(printValue++ + " ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	
//	Pattern - 07 : Reverse Right Half Pyramid - Stars
//	
//	* * * * *
//	* * * * 
//	* * *
//	* * 
//	*
	
	private void pattern07() {

		System.out.println("Pattern - 07 : Reverse Right Half Pyramid - Stars");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= rows - (i - 1) ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	
//	Pattern - 08 : Reverse Right Half Pyramid - Numbers
//	
//	5 5 5 5 5
//	4 4 4 4 
//	3 3 3
//	2 2 
//	1
	
	private void pattern08() {

		System.out.println("Pattern - 08 : Reverse Right Half Pyramid - Numbers");
		System.out.println("Enter the Rows to be Print : ");
		int rows = scanner.nextInt();
		
		for (int i = rows; i >= 1; i--) {
			
			for (int j = 1; j <= i ; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	
	
	
	
	
	
	
	
	

}
