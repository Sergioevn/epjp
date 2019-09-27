package a_exercise4;

public class PerfectNum {
	public static String isPerfect(int input) {
		int sum = 0;
		if (input <= 0) {
			throw new IllegalArgumentException("Number must be natural");
		}

		for (int i = 1; i < input; i++) {
			if (input % i == 0) {
				sum += i;
			}
		}
		if (sum == input) {
			return "Perfect";
		}
		if (sum > input) {
			return "Defective";

		} else {
			return "Abundant";
		}

	}
}
