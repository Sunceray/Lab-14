package rockPaperScissorsPackage;

import java.util.Random;

public class RandomPlayer extends Player {
	Random random = new Random();
	public RandomPlayer() {};
	
	public RandomPlayer(String name) {
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		int wordNumber;
		wordNumber = random.nextInt(3) +1 ; 
		// random number 1 t0 3 //shifts the range by 1 instead 
		
		if (wordNumber == 1) {
			//wordNum is equal to 1
			return Roshambo.ROCK;
		}else if (wordNumber == 2) {
			//wordNum is equal to 2 
			return Roshambo.PAPER;
			
		}else if (wordNumber == 3) {
			//wordNum is equal to 3
			return Roshambo.SCISSORS;
	 } else {
		 return generateRoshambo();
	}
}

}