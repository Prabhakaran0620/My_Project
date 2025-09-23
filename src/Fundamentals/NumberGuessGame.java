package Fundamentals;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numberToGuess = random.nextInt(100) + 1;
		int numberOfTries = 0;
		int guess = 0;

		System.out.println("Welcome to the Number guessing game");
		System.out.println("I have chossen the number between 1 to 100... Can you guess it ?");

		while (guess != numberToGuess) {
			guess = scanner.nextInt();
			numberOfTries++;

			if (guess < numberToGuess) {
				System.out.println("Too low! Try Again");
			}

			else if (guess > numberToGuess) {
				System.out.println("Too high! Try Again");
			}

			else {
				System.out.println("Congratulations! You Guessed it in " + numberOfTries + " tries");
			}

		}
		scanner.close();

	}

}
