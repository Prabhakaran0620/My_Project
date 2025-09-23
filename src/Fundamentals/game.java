package Fundamentals;

import java.util.Random;
import java.util.Scanner;

public class game {

//	Program - rock paper scissor
//
//	input - rock, paper, scissor
//
//	Steps
//	Scanner method implement
//	Random method implement
//	for loop

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[] choices = { "rock", "paper", "scissor" };
		int rounds = 3;
		System.out.println("Welcome to the Rock - Paper - Scissor Game");
		int playerWins = 0;
		int computerWins = 0;

		for (int i = 1; i <= rounds; i++) {
			System.out.println("\nRound : " + i);
			System.out.println("Choose Rock, Paper or Scissor : ");
			String playerChoice = scanner.next().toLowerCase();
			int computer = random.nextInt(3);
			String computerChoice = choices[computer];
			System.out.println("Computer chossen : " + computerChoice);

			if (playerChoice.equals(computerChoice)) {
				System.out.println("It is tie .....");

			} else if ((playerChoice.equals("rock") && computerChoice.equals("scissor"))
					|| (playerChoice.equals("scissor") && computerChoice.equals("paper"))
					|| (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
				System.out.println("Player Wins .......");
				playerWins++;

			} else if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissor")) {
				System.out.println("Computer Wins........");
				computerWins++;
			} else {
				System.out.println("Invalid input ");
			}

			System.out.println("\nPlayer score : " + playerWins + " - " + "Computer score : " + computerWins);
//			System.out.println("Computer score : " + computerWins);

		}
		scanner.close();

	}

}
