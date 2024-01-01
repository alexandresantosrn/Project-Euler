package core;

public class Problem006 {

	/*
	 * The sum of the squares of the first ten natural numbers is, 1² + 2² + ... +
	 * 10² = 385. The square of the sum of the first ten natural numbers is, (1 + 2
	 * + ... + 10)² = 55² = 3025. Hence the difference between the sum of the
	 * squares of the first ten natural numbers and the square of the sum is 3025 -
	 * 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one hundred
	 * natural numbers and the square of the sum.
	 * 
	 * # Solved by: Alexandre Dantas - January 2024 .
	 */

	public static void main(String[] args) {

		int dif = findDifference();
		System.out.println("Result: " + dif);
	}

	/**
	 * Return the difference between the sum of the squares and the square of the
	 * sum for number 100.
	 * 
	 * @return - The difference between the values.
	 */
	private static int findDifference() {

		int sumSquares = 0;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sumSquares += (i * i);
			sum += i;
		}

		int difference = sum * sum - sumSquares;

		return difference;
	}
}
