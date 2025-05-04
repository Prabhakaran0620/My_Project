package Tasks;

public class LoopingStatements {

	public static void main(String[] args) {
		LoopingStatements ForLoopTasks = new LoopingStatements();
		ForLoopTasks.tc01();
		ForLoopTasks.tc02();
		ForLoopTasks.tc03();
		

	}

//	Print first n odd numbers
	private void tc01() {
		int n = 100;
		System.out.print("Task : 1 - Odd numbers from 1 to " + n + " are : ");

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print("\n----------------------------");
	}

//	Print the multiplication table of a number
	private  void tc02() {	
		int n = 5;
		System.out.println("\nTask : 2 - Multipliaction table of number : " + n);
		for (int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d \n", n, i, i*n);			
		}
		System.out.print("----------------------------");		
	}
	
//	Print the sum of the first 100 natural numbers
	private void tc03() {
		int n = 0;

		for (int i = 1; i <= 100; i++) {
			n += i;
			}
		System.out.print("Task : 3 - The sum of the first 100 natural numbers are : " + n);
		System.out.print("\n----------------------------");
		
	}
		
}
	
	


