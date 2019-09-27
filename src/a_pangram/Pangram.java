package a_pangram;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
	public static boolean isPangram(String input) {
		Set<Character> list = new HashSet<Character>();
		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				list.add(input.charAt(i));
			} else
				continue;
		}
		if (list.size() == 26) {
			return true;
		}
		return false;
	}
}
