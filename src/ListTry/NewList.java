package ListTry;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class NewList {

	public static void main(String[] args) {
		System.out.println(NewString("derabwourvgvrepemvegveracabz"));
	}

	public static String NewString(String sb) {

		Set<Character> myList = new TreeSet<>();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < sb.length(); i++) {
			myList.add(sb.charAt(i));

		}

		Iterator<Character> iter = myList.iterator();
		while (iter.hasNext()) {
			result.append(iter.next());
		}
		return result.toString();
	}

}
