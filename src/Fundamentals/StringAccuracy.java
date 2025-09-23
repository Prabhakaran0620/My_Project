package Fundamentals;

import java.util.Scanner;

public class StringAccuracy {

//	Program - Typing speed and Time taken accuracy
//
//	Output
//	Typing speed - 
//	Accuracy - 
//	Time Taken - 
//
//	Steps 
//	Scanner class implementation
//	Provide input - for eg: any sentences
//	Measure start time and end time
//	Compare the diff between start and end time
//	Compare the input (harcoded value) and output (value passing in scanner)
//	Calculate speed and accuracy
//	Print statement

	public static void main(String[] args) {

		String inputSentence = "Money makes many things";

		System.out.println("Type this sentence: " + inputSentence);
		Scanner scanner = new Scanner(System.in);
		double startTime = System.currentTimeMillis();
		String userInput = scanner.nextLine();
		scanner.close();
		double endTime = System.currentTimeMillis();

//      Compare the diff between start and end time
		double timeTaken = (endTime - startTime) / 1000;

//      Compare the input (harcoded value) and output (value passing in scanner)
		int text = Math.min(inputSentence.length(), userInput.length());
		int correctLetters = 0;
		StringBuilder missedLetters = new StringBuilder();

		for (int i = 0; i < text; i++) {
			if (inputSentence.charAt(i) == userInput.charAt(i)) {
				correctLetters++;
			} else {
				missedLetters.append(inputSentence.charAt(i));
			}
		}

//      Calculate speed and accuracy
		double speed = userInput.length() / timeTaken;
		double accuracy = (correctLetters * 100.0) / inputSentence.length();
		System.out.println("\nResults:");
		System.out.println("Time Taken: " + timeTaken + " seconds");
		System.out.println("Typing Speed: " + speed + " chars/sec");
		System.out.println("Accuracy: " + accuracy + "%");
		if (missedLetters.length() > 0) {
			System.out.println("Missed Letters: " + missedLetters);
		} else {
			System.out.println("Perfect typing!");
		}

	}

}
