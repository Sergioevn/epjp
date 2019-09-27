package a_yathzee;

import java.util.concurrent.ThreadLocalRandom;

public class ThrowDice {
public static void main(String[] args) {
	
}
	public static int DiceRandom() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6+ 1);
	
	return randomNum;
	
}
	
}