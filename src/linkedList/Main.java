package linkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MyList myList = new MyList();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers to create Array." + "\n00 closes the Array.");
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
		System.out.println("\n" + myList);
		System.out.println("List size is: " + String.valueOf(myList.size()));
		System.out.println("\nType the index you want to know value of");
		{
			while (scanner.hasNext()) {
				int i = scanner.nextInt();

				if (i <= 0 || i > myList.size()) {
					System.out.println(
							"Value is not in the range, please repeat with a number between 1 and " + myList.size());
				}

				else {
					System.out.println("\nThe value in position " + i + " is "+ "["+ String.valueOf(myList.get(i)+ "]"));
					break;
				}
			}
			myList.pop();
			System.out.println("\nList withouth the first element is: " + myList);
		}

		scanner.close();
		System.out.println("\nProgram ended.");
	}

}
