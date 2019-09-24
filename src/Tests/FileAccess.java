package Tests;

import java.util.Scanner;

public class FileAccess {	
	public static void main(String[] args) {
	System.out.println("Please, enter a few numbers." + "\nCTRL+Z stops the program.");
	Scanner scanner = new Scanner(System.in);

	while (scanner.hasNext()) {
		if (scanner.hasNextInt()) {
			int numin = scanner.nextInt();
			if (numin == 0)
				break;

			else if (numin % 2 > 0) {
				System.out.println("Odd number");
			} else if (numin % 2 == 0) {
				System.out.println("Fair Number");
			}
		}

		else {
			System.out.println("Bad input, discarded: " + scanner.next());

		}

	}
	scanner.close();
	System.out.println("\nProgram ended.");
}
}


