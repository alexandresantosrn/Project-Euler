package core;

public class Problem009 {

	/*
	 * 
	 * # Solved by: Alexandre Dantas - January 2024.
	 */
	public static void main(String[] args) {

		int prod = findProdPythagorean();
		System.out.println(prod);
	}

	private static int findProdPythagorean() {

		int a;
		int b;
		int c;
		double d;
		double partial;
		boolean find = false;

		while (!find) {

			for (int i = 0; i < 1000; i++) {
				for (int j = 0; j < 1000; j++) {
					c = 1000 - i - j;

					if (c <= 0) {
						break;
					}
					
					partial = (c * c) + (i * i) + (j * j);
					
					d = Math.sqrt(partial);
					
					System.out.println(d);
				}
			}

		
		}
		return 0;
	}
}	

