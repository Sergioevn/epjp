package linkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		linkedList myList = new linkedList();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers to create Array" + "\n00 closes the Array");
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {

				int numin = scanner.nextInt();
				if (numin != 00) {
					myList.add(numin);
				} else {
					break;
				}
			}
		}
		System.out.println(myList);
		System.out.println("List size is: " + String.valueOf(myList.size()));
		System.out.println(String.valueOf(myList.get()));

		scanner.close();
		System.out.println("\nProgram ended.");
	}

}
