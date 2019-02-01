package rockPaperScissorsPackage;

import java.util.Scanner;

public class UserPlayer extends Player {
	Scanner sc;
	public UserPlayer() {}
	public UserPlayer(Scanner sc, String name) {
		super(name);
		this.sc = sc;
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub

		String choice = Validator.getString(sc, "Choose between 'ROCK', 'PAPER', and 'SCISSORS'.");

		choice = choice.toLowerCase();
		if (choice.equals("rock")){ 
			 return Roshambo.ROCK;
		} else if (choice.equals("paper")) {
			 return Roshambo.PAPER;
		} else if (choice.equals("scissors")){
			return Roshambo.SCISSORS;
		} else {
			System.out.println("Invalid input");
			return generateRoshambo();
		}
	}

}