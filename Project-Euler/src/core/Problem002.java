package core;

public class Problem002 {

	/*
	 * Each new term in the Fibonacci sequence is generated by adding the previous
	 * two terms. By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5,
	 * 8, 13, 21, 34, 55, 89 ...
	 * 
	 * By considering the terms in the Fibonacci sequence whose values do not exceed
	 * four million, find the sum of the even-valued terms.
	 * 
	 * # Solved by: Alexandre Dantas - December 2023
	 */

	public static void main(String[] args) {

		int sum = findSumFibonacci();
		System.out.println("Result: " + sum);
	}

	/**
	 * Return the sum of even-valued terms of the Fibonacci sequence, below 4000000.
	 * 
	 * @return int - Sum of terms.
	 */
	private static int findSumFibonacci() {

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int sum = 0;

		while (n3 < 4000000) {

			if (n3 % 2 == 0) {
				sum += n3;
			}

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

		return sum;
	}
}
