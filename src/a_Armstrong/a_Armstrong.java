package a_Armstrong;

import java.util.ArrayList;

public class a_Armstrong {
	public static boolean checkArmstrong(int input) {
		int pow = 0;
		int check= input;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (input>0) {
			list.add(input % 10);
			pow++;
			input /= 10;
		}

		int arm = 0;
		for (int j = 0; j < list.size(); j++) {
			arm += Math.pow(list.get(j), pow);
		}

		return check == arm;
	}

	public static void main(String[] args) {
		System.out.println("Is 370 an Armstrong number?" + "\n"+ checkArmstrong(370));
		System.out.println("Is 350 an Armstrong number?" + "\n"+ checkArmstrong(350));
		System.out.println("Is 371 an Armstrong number?" + "\n"+ checkArmstrong(371));
		System.out.println("Is 1634 an Armstrong number?" + "\n"+ checkArmstrong(1634));
		System.out.println("Is 2 an Armstrong number?" + "\n"+ checkArmstrong(2));
	}

}
