package ex;

import s037.Array2D;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		if (first > last)
			return 0;

		int somma = 0;

		for (int cur = first; cur <= last; cur++) {
			somma += cur;
		}

		return somma;

	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		// TODO
		if (first > last)
			return 0;

		int somma = 0;

		for (int cur = first; cur <= last; cur++) {
			if (cur % 2 == 0)
				somma += cur;
		}

		return somma;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		if (value < 0)
			return 0;

		int sum = 1;
		{
			while (value > 0) {
				sum = sum * value;
				value -= 1;
			}
			return sum;
		}
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		int prev = 0;
		int cur = 1;
		int next = 0;
		if (value == 0)
			return 0;
		if (value <= 2)
			return 1;
		for (int i = 1; i < value; i++) {
			next = prev + cur;
			prev = cur;
			cur = next;

		}
		;

		return next;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		int i = 0;
		while (i <= value) {result[i][i]=result[i+i][i+i] ;i++;}
			return result ;
	}
}
