package core;

public class Problem003 {

	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143?
	 * 
	 * # Solved by: Alexandre Dantas - December 2023.
	 */

	public static void main(String[] args) {

		long number = 600851475143l;
		int factor = findLargestPrimeFactor(number);

		System.out.println("Result: " + factor);
	}

	/**
	 * Return the largest prime factor of the informed number.
	 * 
	 * @param number - The informed number.
	 * @return - The largest prime factor. 
	 */
	private static int findLargestPrimeFactor(long number) {

		int factor = 0;

		while (number > 1) {

			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					number /= i;
					factor = i;
					i -= 1;
				}
			}

		}

		return factor;
	}

}
