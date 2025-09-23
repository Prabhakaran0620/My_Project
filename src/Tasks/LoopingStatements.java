package Tasks;

import java.util.Iterator;

public class LoopingStatements {

	public static void main(String[] args) {
		LoopingStatements ForLoopTasks = new LoopingStatements();
		ForLoopTasks.tc01();
		ForLoopTasks.tc02();
		ForLoopTasks.tc03();
		ForLoopTasks.tc04();
		ForLoopTasks.tc05();

	}

//	Print first n odd or even numbers
	private void tc01() {
		int n = 100;
//		System.out.print("Task : 1 - Odd numbers from 1 to " + n + " are : ");
		System.out.print("Task : 1 - Even numbers from 1 to " + n + " are : ");


		for (int i = 1; i <= n; i++) {
//			if (i % 2 != 0) {
			if (i % 2 != 1) {	
				System.out.print(i + " ");
			}
		}
		System.out.println("\n----------------------------");
	}

//	Print the multiplication table of a number
	private  void tc02() {	
		int n = 5;
		System.out.println("Task : 2 - Multipliaction table of number : " + n);
		for (int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d \n", n, i, i*n);			
		}
		System.out.println("----------------------------");		
	}
	
//	Print the sum of the first 100 natural numbers
	private void tc03() {
		int n = 0;

		for (int i = 1; i <= 100; i++) {
			n += i;
			}
		System.out.println("Task : 3 - The sum of the first 100 natural numbers are : " + n);
		System.out.println("----------------------------");
		
	}
	
//	Check if a number is prime
	private void tc04() {
		System.out.println("Task : 4 - Prime number check");
		int number [] = {11, 15, 1, 98};
		for(int n : number) {
			System.out.printf("If %d number is prime number then print : %s\n", n, isPrime(n) ? "true" : "false");
		}
		System.out.println("----------------------------");
		
	}
	
	static boolean isPrime(int value) {
		if (value <=1) {
			return false;
		}
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
//	Basic Triangle Pattern with * or numbers
	private void tc05() {
		int rows = 10;
		
		for (int i = 1; i<=10; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
//				System.out.print(j + " ");
			}
			
			System.out.println();	
		}
		System.out.println("----------------------------");
	}
	
		
}
	
	


