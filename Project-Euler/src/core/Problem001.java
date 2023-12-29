package core;

public class Problem001 {

	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
	 * get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * # Solved by: Alexandre Dantas - December 2023
	 */

	public static void main(String[] args) {

		int sum = findSum();
		System.out.println("Result: " + sum);
	}

	/**
	 * Return the sum of multiples divided by 3 or 5, below 1000.
	 * 
	 * @return int - Sum of multiples.
	 */
	private static int findSum() {

		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		return sum;
	}

}
