package a_yathzee;

public class ThrowDice {
	public static int yathzee(int[] arrayDice, Chances chance) {
		int result = 0;
		int freq = 0;
		int index = 0;
		int fullcomb = 0;
		for (int i = 0; i < arrayDice.length; i++) {

			if (arrayDice[i] > 6 || arrayDice[i] < 1) {
				throw new IllegalArgumentException("Numbers must be between 1 and 6");
			}

			else {

				for (int j = 0; j < arrayDice.length; j++) {
					if (arrayDice[index] == arrayDice[j]) {
						freq++;
						fullcomb += freq;
					}
				}
			}
			{

				// THREE OF A KIND
				if (freq >= 3 && chance == Chances.THREES) {
					result = 3 * arrayDice[index];

				}
				// FOUR OF A KIND
				if (freq >= 4 && chance == Chances.FOUR) {
					result = 4 * arrayDice[index];
				}
				// YAHTZEE
				if (freq == 5 && chance == Chances.FIVE) {
					result = 50;
				}

				// FULL HOUSE
				if (freq >= 3 && fullcomb == 15 && chance == Chances.FULL) {
					result = 25;
				}
			}
		}

		return result;
	}
}