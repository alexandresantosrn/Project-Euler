package core;

public class Problem007 {

	/*
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * What is the 10001st prime number?
	 */

	public static void main(String[] args) {

		int primeNumber = findPrimeNumber();
		System.out.println("Result: " + primeNumber);
	}

	/**
	 * Return the 10001st prime number.
	 * 
	 * @return - The 10001st prime number.
	 */
	private static int findPrimeNumber() {

		int count = 1;
		int value = 3;
		int prime = 2;

		do {

			if (isPrime(value)) {
				prime = value;
				count++;
			}

			value += 2;

		} while (count <= 10000);

		return prime;
	}

	/**
	 * Return true if the informed number is a prime number. Otherwise, it returns
	 * false.
	 * 
	 * @param value - The informed number.
	 * @return - Return true if the informed number is a prime number.
	 */
	private static boolean isPrime(int value) {

		int count = 0;

		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				count++;
			}
		}

		return count == 2 ? true : false;
	}

}
