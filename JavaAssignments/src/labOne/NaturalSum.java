/* This program calculates the sum of first n natural numbers which are divisible by 3 or 5. */

package labOne;

import java.util.Scanner;

public class NaturalSum {
	
	static int calculateSum(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 3 == 0 || i % 5 == 0 || i % 15 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the number upto which you would like to find the sum: ");
		int number = s.nextInt();
		
		int sum = calculateSum(number);
		
		System.out.println("The sum of the first " + number + " natural numbers divisible by 3 or 5 is: " + sum);
		s.close();

	}

}
