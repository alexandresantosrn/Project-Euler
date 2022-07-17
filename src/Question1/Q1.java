package Question1;

import java.util.ArrayList;

/* 
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000. 
*/

public class Q1 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int limit = 1000;
		int sum = 0;

		numbers = findMultiples3and5(limit);

		sum = sumNumbers(numbers);
		
		System.out.println("Result: "+sum);
	}

	private static ArrayList<Integer> findMultiples3and5(int limit) {

		ArrayList<Integer> listNumbers = new ArrayList<Integer>();

		for (int i = 1; i < limit; i++) {

			if (i % 3 == 0 || i % 5 == 0) {

				listNumbers.add(i);
			}
		}

		return listNumbers;
	}

	private static int sumNumbers(ArrayList<Integer> numbers) {
		
		int sum = 0;
		
		for (Integer number: numbers) {
			
			sum += number;
		}
		
		return sum;		
	}

}
