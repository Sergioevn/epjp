package a_exercise3;

import java.util.ArrayList;

public class Hamming {
	public static int hamming(String a1, String a2) {
		ArrayList<Character> lista1 = new ArrayList<Character>();
		ArrayList<Character> lista2 = new ArrayList<Character>();
		int distance = 0;
		
		if (a1.isEmpty() || a2.isEmpty()) {
			throw new NullPointerException("Strings can't be empty!");
		}
		if (a1.length() != a2.length()) {
			throw new IllegalArgumentException("Strings' length must be the same!");
		}
		for (int i = 0; i < a1.length(); i++) {
			lista1.add(i, a1.charAt(i));
			lista2.add(i, a2.charAt(i));
		}
		for (int i = 0; i < lista1.size(); i++) {
			if (lista1.get(i) == lista2.get(i)) {
				continue;
			} else
				distance++;
		}

		return distance;

	}

}
