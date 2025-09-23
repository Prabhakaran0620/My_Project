package Fundamentals;

import java.util.*;

public class OopsConceptsTask05 implements OopsConceptsTask06 {

	public static void main(String[] args) {

//		Task 6: Write a Java Program
//		 
//		a)  Two different classes should be defined and one class should be an interface .
//		b) Define five methods in interface
//		c) Implement interface in other class with those five methods definition

		OopsConceptsTask05 obj = new OopsConceptsTask05();

		System.out.println("Oops Concept Task 06  ");
		obj.methodOne();
		System.out.println("methodTwo : " + obj.methodTwo(10));
		System.out.println("methodThree : " + obj.methodThree("OOPS CONCEPT TO LOWERCASE"));
		System.out.println("methodFour : " + obj.methodFour(89, 99));
		System.out.println("methodFive : " + obj.methodFive(8));
		System.out.println("---------------------------------");

//		Task 7 : Write a Java Program
//		 
//		a) Add 10 values (Include duplicate Values) in List and Set
//		b) Print all values via enhanced for and remove 3rd value

		List<String> list = new ArrayList<>();
		list.add("ArrayListString --- 01");
		list.add("ArrayListString --- 02");
		list.add("ArrayListString --- 03");
		list.add("ArrayListString --- 04");
		list.add("ArrayListString --- 01");
		list.add("ArrayListString --- 05");
		list.add("ArrayListString --- 01");
		list.add("ArrayListString --- 06");
		list.add("ArrayListString --- 01");
		list.add("ArrayListString --- 01");

		Set<String> set = new HashSet<>(list);

		System.out.println("Oops Concept Task 07  ");

		System.out.println("List Values");
		for (String value : list) {
			System.out.println(value);

		}

		List<String> tempList = new ArrayList<>(set);
		if (tempList.size() > 2) {
			tempList.remove(2);
		}

		set = new HashSet<>(tempList);

		System.out.println();
		System.out.println("Set Values (after removing 3rd value):");
		for (String value : set) {
			System.out.println(value);

		}

		System.out.println("---------------------------------");

	}

	@Override
	public void methodOne() {
		System.out.println("MethodOne calling from interface");
	}

	@Override
	public int methodTwo(int a) {
		return a * 24;
	}

	@Override
	public String methodThree(String input) {
		return input.toLowerCase();
	}

	@Override
	public boolean methodFour(int x, int y) {
		return x > y;
	}

	@Override
	public double methodFive(double val) {
		return Math.sqrt(val);
	}

}
