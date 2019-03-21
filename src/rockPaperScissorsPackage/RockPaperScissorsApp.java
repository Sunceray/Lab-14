package rockPaperScissorsPackage;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RockPaperScissorsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		//scnr is an instance
		
		String name;
		//Prompting player
		
		String choice;
		String yn = null;
		
		RandomPlayer ranPlay = new RandomPlayer("Earl");
		//init class RandomPlayer with a string variable (name of random player)
				
		AlwaysRock rocPlay = new AlwaysRock("Vonnie");
		
		System.out.println("Welcome To Rock Paper Sissors!");
		System.out.print("Enter your name: ");
		name = scnr.nextLine();
		
		UserPlayer usePlay = new UserPlayer(scnr, name);
		
		
		Roshambo ranChoice = null;
		Roshambo rockChoice = null;
		
		do {
			System.out.print("Who would you like to play aganist? Earl or Vinnie?(e/v) ");
			choice = scnr.nextLine();
			
			if(choice.startsWith("E") || choice.startsWith("e")) {
				ranChoice = ranPlay.generateRoshambo();
			}
			else if(choice.startsWith("V") || choice.startsWith("v")) {
				rockChoice = rocPlay.generateRoshambo();
			}
			else {
				System.out.print("Invalid input!");
				continue;
			}
			Roshambo humanChoice = usePlay.generateRoshambo();
			
			System.out.println(usePlay.getName() + " played: " + humanChoice);
			
			if(ranChoice == null) {
				System.out.println(rocPlay.getName() + " played: " + rockChoice);
				
				if(humanChoice.equals(rockChoice) ) {
					System.out.println("oh so sorry try again");
				} else if (humanChoice.equals(Roshambo.ROCK) && rockChoice.equals(Roshambo.SCISSORS)) {
					System.out.println("Winner winner chicken dinner!");
				} else if (humanChoice.equals(Roshambo.PAPER) && rockChoice.equals(Roshambo.ROCK)) {
					System.out.println("Winner winner chicken dinner!");
				} else if (humanChoice.equals(Roshambo.SCISSORS) && rockChoice.equals(Roshambo.PAPER)) {
					System.out.println("Winner winner chicken dinner!");
				} else {
					System.out.println("Sorry no dinner =(");
				}
			}
			else {
				System.out.println(ranPlay.getName() + " played: " + ranChoice);
				
				if(humanChoice.equals(ranChoice) ) {
					System.out.println("oh so sorry try again");
				} else if (humanChoice.equals(Roshambo.ROCK) && ranChoice.equals(Roshambo.SCISSORS)) {
					System.out.println("Winner winner chicken dinner!");
				} else if (humanChoice.equals(Roshambo.PAPER) && ranChoice.equals(Roshambo.ROCK)) {
					System.out.println("Winner winner chicken dinner!");
				} else if (humanChoice.equals(Roshambo.SCISSORS) && ranChoice.equals(Roshambo.PAPER)) {
					System.out.println("Winner winner chicken dinner!");
				} else {
					System.out.println("Sorry no dinner =(");
				}
			}
			ranChoice = null;
			rockChoice = null;
			
			System.out.print("Play again? (y/n): ");
			yn = scnr.nextLine();
		} while(!yn.equalsIgnoreCase("n"));
		System.out.println("Goodbye!");
		
		
		
		
		
		
		
		
		
		
	}
	
}