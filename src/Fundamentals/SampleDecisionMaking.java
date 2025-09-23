package Fundamentals;

import java.util.Scanner;
import java.util.Arrays;

public class SampleDecisionMaking {	

    private Scanner scanner;

    public SampleDecisionMaking(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SampleDecisionMaking demo = new SampleDecisionMaking(scanner);
        
        demo.Task01();
		demo.Task02();
		demo.Task03();
		demo.Task04();
		demo.Task05();
		demo.Task06();
		demo.Task07();
		demo.Task08();
		demo.Task09();
        scanner.close(); 

	}

//	Task 1: Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.

	private void Task01() {
        System.out.print("Task 01 - Enter your age: ");
        int userAge = scanner.nextInt();

        if (userAge < 18) {
            System.out.println(userAge + " - Age Limit Restricted to vote");
        } else {
            System.out.println(userAge + " - User can vote");
        }
        System.out.println("--------------------");
    }

//	Task 2: Write Java program that accepts three number from the user and print the greatest number.

	private void Task02() {
		
		System.out.println("Task 2 : The Greatest of Three numbers");
		
		System.out.println("Enter the first number : ");
		int a = scanner.nextInt();
		
		System.out.println("Enter the Second number : ");
		int b = scanner.nextInt();
		
		System.out.println("Enter the third number : ");
		int c = scanner.nextInt();
		
		int greatest = 0;
		
		if (a >= b && a >= c) {
			greatest = a;
		}
		else if (b >= c) {
			greatest = b;
		}
		else {
			greatest = c;
		}
		
		System.out.println("The Greatest number is : " + greatest);
        System.out.println("--------------------");
		
		
    }

//	Task 3:Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday

	private void Task03() {
        System.out.print("Task 03 - Enter a number (1 to 7): ");
        int dayValue = scanner.nextInt();
        
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

		System.out.println("--------------------");

	}

//	Task 4: Write a program to calculate the sum of first 10 natural number. [Try the program in for,while and dowhile]

	private void Task04() {

//		For Loop
		int n = 0;

		for (int i = 1; i <= 10; i++) {
			n += i;
		}
		System.out.println("Task : 4 - The sum of the first 10 natural numbers with For Loop : " + n);

//		While Loop
		int n1 = 0;
		int i = 1;
		while (i <= 10) {
			n1 += i;
			i++;
		}
		System.out.println("Task : 4 - The sum of the first 10 natural numbers with while Loop : " + n1);

//		Do While Loop
		int n2 = 0;
		int a = 1;
		do {
			n2 += a;
			a++;
		} while (a <= 10);
		System.out.println("Task : 4 - The sum of the first 10 natural numbers with Do while Loop : " + n2);
		System.out.println("----------------------------");

	}

//	Task 5: Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. (Hint : Surf Net)

	private void Task05() {
		System.out.print("Task 5 : Table of Multiplication : ");
		int n = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d \n", n, i, n * i);
		}
		System.out.println("----------------------------");

	}

//	Task 6: Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321. (Frequently asked in Interview) (Hint : Learn concept on net and do it on your own) 

	private void Task06() {
		System.out.print("Task 6 : Enter the Value to be Reversed : ");

		int n = scanner.nextInt();;
		int reverse = 0;

		while (n != 0) {
			int value = n % 10;
			reverse = reverse * 10 + value;
			n /= 10;
		}

		System.out.println("Reversal value - " + reverse);
		System.out.println("----------------------------");

	}

//	Task 7:Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. (Frequently asked in Interview) (Hint : Learn concept on net and do it on your own) 

	private void Task07() {
		System.out.println("Task  7 : Enter a number to check if it's prime: ");
		int number = scanner.nextInt();
		System.out.println("Value : " + (isPrime(number) ? "true" : "false"));
		System.out.println("----------------------------");

	}

	static boolean isPrime(int value) {
		if (value <= 1) {
			return false;
		}

		for (int i = 2; i < value; i++) {
			if (value % 2 == 0) {
				return false;
			}
		}

		return true;

	}

//	Task 8: Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....  (Frequently asked in Interview) (Hint : Learn concept on net and do it on your own) 

	private void Task08() {
		System.out.println("Enter the value for the series : " );
		int n = scanner.nextInt();
		int firstValue = 1, secondValue = 1, t;
		System.out.println("Task 08 : Fibonacci series");
		System.out.println(firstValue + " ");
		System.out.println(secondValue + " ");

		for (int i = 3; i <= n; i++) {
			t = firstValue + secondValue;
			System.out.println(t + " ");
			firstValue = secondValue;
			secondValue = t;

		}

	}

//		Task 9:Write a program to print following : 
//			1
//			222
//			33333

	private void Task09() {

		System.out.println("-------------------------");
		System.out.println("Task 9 : Pattern Format rows to print : ");

		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(i);
			}

			System.out.println();
		}
		System.out.println("------------------------");
	}

}
