package Fundamentals;


public class SampleDatatypes {


	public static void main(String[] args) {
		SampleDatatypes Demo = new SampleDatatypes();
//		Demo.Task01();
//		Demo.Task02();
//		Demo.Task03();
//		Demo.Task04();
//		Demo.Task05();
		
	}
	
//	Task 1: Write a Java program to declare three variable  a, b, & c and store the values respectively 10, 20.3 & 3.14785 . Then display their values on the screen.
	
	private void Task01() {
		int a = 10;
		float b = (float) 20.3;
		double c = 3.14785;
		
		System.out.println("Task 01 : ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------------------");
		
	}
	
//	Task 2: Write a Java program to declare a Boolean variable with initial value of “true” and later change it to “false” before printing it.

	private void Task02() {
		
		boolean c = true ;
		
		 if (c) {
			 c= false;
			 System.out.println(c);
		 }
		System.out.println("--------------------");
		
	}
	
//	Task 3:  Write a Java program that accepts two integers from the user and then prints the sum (add) , the difference (sub) and the product (mul).
 
	private void Task03() {
		int a = 10, b = 20;
		System.out.println("Task 03 : ");
		System.out.println("Addition of value : " + (a+b));
		System.out.println("Subtraction of value : " + (a-b));
		System.out.println("Multiplication of value : " + (a*b));
		System.out.println("--------------------");
				
	}
	
//	Task 4:  Write a Java program to declare a int variable with initial value of “5” and convert it to “String” before printing it.

	private void Task04() {
		
	    int num = 5;
	    String str = String.valueOf(num);
	    System.out.println("Task 04 : ");
	    System.out.println("Interger Value converted to : " + str);
	    System.out.println("--------------------");
		
	}
	
//	Task 5:  Write a Java program to declare a String variable with initial value of “5” and convert it to “int” before printing it. 
	
	private void Task05() {
		
		String str = "5";
		int num = Integer.valueOf(str);
	    System.out.println("Task 05 : ");
		System.out.println("String value converted to : " + num);
	    System.out.println("--------------------");
		
	}
	
//	You are provided with a list of user names, for example:
//		["yashana", "surya(*", "nishanthi", "yakshana", "surya(*"]
//		Remove any special characters from each user name (e.g., "surya(*" should become "surya").
//		Convert all names to lowercase to ensure uniformity.
//		Remove duplicate names after cleaning.
//		For each unique cleaned name, count how many times the character 'a' appears.
//		Print each cleaned name along with its count of the character 'a'.
	
//	private void Task06() {
//		System.out.println("Removing the special characters - (");
//
//		String[] value = {"yashana", "surya(*", "nishanthi", "yakshana", "surya(*"};
//		char toRemove = '(';
//		
//		String outputAfterStringRemoval = removeCharacter(value, toRemove);
//	
//		
//		
//	}
	
	
	
	

}
