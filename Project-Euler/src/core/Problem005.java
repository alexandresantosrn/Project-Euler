package core;

public class Problem005 {

	/*
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
	 * without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of the
	 * numbers from to 1 to 20?
	 * 
	 * # Solved by: Alexandre Dantas - December 2023.
	 */

	public static void main(String[] args) {

		int smallestNumber = findSmallestNumber();
		System.out.println("Result: " + smallestNumber);
	}

	/**
	 * Return the smallest number that is evenly divisible by all of the
	 * numbers from to 1 to 20.
	 * 
	 * @return - The smallest number.
	 */
	private static int findSmallestNumber() {

		boolean finished = false;
		int number = 19;

		while (!finished) {
			number++;

			for (int i = 1; i <= 20; i++) {
				if (number % i != 0) {
					break;
				}

				if (i == 20) {
					finished = true;
				}

			}

		}

		return number;
	}

}
