/* This program finds the difference between the sum of the squares of the first n natural numbers and the square of their sum*/

package labOne;

import java.util.Scanner;

public class SeriesDifference {
	
	static int calculateDifference(int n) {
		
		int sumOfSquares = 0, squareOfSum = 0;
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
			sumOfSquares += Math.pow(i, 2);
			
		}
		
		squareOfSum = sum * sum;
		int difference = sumOfSquares - squareOfSum;
		return difference;
		
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		int number = s.nextInt();
		
		int diff = calculateDifference(number);
		System.out.println("The solution to the series with " + number + " elements in it is: " + diff);
		s.close();

	}

}
