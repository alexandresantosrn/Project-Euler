package core;

public class Problem004 {

	/*
	 * A palindromic number reads the same both ways. The largest palindrome made
	 * from the product of two 2-digit numbers is 9009 = 91 x 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 * # Solved by: Alexandre Dantas - December 2023.
	 */

	public static void main(String[] args) {

		int largestPalindrome = findLargestPalindrome();
		System.out.println("Result: " + largestPalindrome);
	}

	/**
	 * Return the largest palindrome number.
	 * 
	 * @return - The largest palindrome number.
	 */
	private static int findLargestPalindrome() {

		int prod = 0;
		int largestPalindrome = 0;

		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				prod = i * j;

				if (isPalindrome(prod)) {
					if (prod > largestPalindrome) {
						largestPalindrome = prod;
					}
				}

			}
		}

		return largestPalindrome;
	}

	/**
	 * Return true if the informed number is a palindrome. Otherwise, it returns
	 * false.
	 * 
	 * @param prod - The informed number.
	 * @return - Return true if the informed number is a palindrome.
	 */
	private static boolean isPalindrome(int prod) {

		String number = Integer.toString(prod);
		String numberReverse = "";

		for (int i = number.length() - 1; i >= 0; i--) {

			numberReverse += number.charAt(i);
		}

		return number.equals(numberReverse) ? true : false;
	}

}
