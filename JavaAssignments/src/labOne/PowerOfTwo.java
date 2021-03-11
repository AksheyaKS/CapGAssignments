/* This program checks if the entered number is a power of two or not*/

package labOne;

import java.util.Scanner;

public class PowerOfTwo {
	
	static boolean checkNumber(int n) {
		
		if(n == 0) {
			
			return false;
			
		} else {
			
			while(n != 1) {
				
				if(n % 2 != 0) {
					
					return false;
					
				}
				
				n /= 2;
				
			}
			
			return true;
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int number = s.nextInt();
		
		boolean flag = checkNumber(number);
		
		if(flag) {
			
			System.out.println("The number " + number + " is a power of two");
			
		} else {
			
			System.out.println("The number " + number + " is not a power of two");
			
		}
		
		s.close();

	}

}
