package ex;

public class S56 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(s.length() - 1 - i);
			sb.append(c);
		}

		return sb.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(s.length() - 1 - i);
			sb.append(c);
		}
		String compare = new String(sb);
		if (s.compareTo(compare) > 0)

			return false;
		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i <= sb.length(); i++) {
			char c = sb.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
				sb.deleteCharAt(i);
		}

		return sb.toString();

	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {

		int tot = 0;
		for (int i = 0; i < s.length(); i++) {
			int c = 2 * (Character.getNumericValue(s.charAt(s.length() - 1 - i)));
			if (c > 0) {
				tot += Math.pow(c, i);
			} else {
				tot += 0;
			}
			;
		}
		return tot;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			result[data.length - 1 - i] = data[i];
		}

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double avg = 0;
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		avg = sum / data.length;
		return avg;

	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		if (data == null || data.length == 0) {
			return Integer.MIN_VALUE;
		}

		int indexMax = 0;

		for (int i = 1; i < data.length; i++) {
			if (data[i] > data[indexMax]) {
				indexMax = i;
			}
		}
		return data[indexMax];
	}
}
