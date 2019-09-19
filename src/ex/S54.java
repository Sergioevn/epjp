package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value > 0)
			return "positive";
		if (value < 0)
			return "negative";
		else
			return "zero";
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {

		if (Math.abs(value % 2) > 0)
			return true;
		else
			return false;
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		if (value == 0)
			return "zero";
		if (value == 1)
			return "Uno";
		if (value == 2)
			return "Due";
		if (value == 3)
			return "Tre";
		if (value == 4)
			return "Quattro";
		if (value == 5)
			return "Cinque";
		if (value == 6)
			return "Sei";
		if (value == 7)
			return "Sette";
		if (value == 8)
			return "Otto";
		if (value == 9)
			return "Nove";
		else
			return "other";
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		// TODO

		if (percentile > 90)
			return 'A';
		if (percentile > 80 && percentile <= 90)
			return 'B';
		if (percentile > 70 && percentile <= 80)
			return 'C';
		if (percentile > 60 && percentile <= 70)
			return 'D';
		if (percentile > 50 && percentile <= 60)
			return 'E';
		if (percentile <= 50)
			return 'F';
		else
			return 0;
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 == 0 && (year % 400 == 0))
			return true;
		if (year % 4 == 0 && year % 100 > 0)
			return true;
		if (year % 4 == 0 && year % 100 == 0 && (year % 400 > 0))
			return false;
		if (year % 4 > 0)
			return false;
//		else
		return true;
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
				
		{if (a < b && a < c && b > c)
			result[0] = a;
		result[1] = c;
		result[2] = b;}
		if (a < b && a < c && b < c)
			result[0] = a;
		result[2] = c;
		result[1] = b;
		if (b < a && b < c && a < c)
			result[0] = b;
		result[1] = a;
		result[2] = c;;
		if (b < a && b < c && a > c)
			result[0] = b;
		result[2] = a;
		result[1] = c;
		if (c < b && c < a && a < b)
			result[0] = c;
		result[1] = a;
		result[2] = b;;
		if (c < b && c < a && a > b)
			result[0] = c;
		result[1] = b;
		result[2] = a;

		return result;
	}}
		
		
			
			
			
	
