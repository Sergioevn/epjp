package Tests;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImportFile {
	public static void main(String[] args) throws IOException {
		File f = new File("/Users/Administrator/Desktop/values.txt");
		 
		Scanner scanner = new Scanner(f);

		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int numin = scanner.nextInt();
				if (numin == 0) {
					 System.out.println(numin + " found"); break;}

				else if (numin % 2 > 0) {
					System.out.println(numin + " is an odd number");
				} else if (numin % 2 == 0) {
					System.out.println(numin +" is a fair Number");
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