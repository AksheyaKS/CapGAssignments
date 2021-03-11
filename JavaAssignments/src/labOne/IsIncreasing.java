/* This program checks if a number is an increasing number*/

package labOne;
import java.util.Scanner;

public class IsIncreasing {
	
	static boolean checkNumber(int n) {
		
		int start = n % 10;
		n = n / 10;
		int temp;
		boolean flag = true;
		while(n != 0) {
			
			temp = n % 10;
			if(temp > start) {
				
				flag = false;
				break;
				
			} else {
				
				n = n / 10;
				start = temp;
				temp = 0;
				
			}
			
		}
		return flag;
		
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the number you want to check: ");
		int number = s.nextInt();
		
		boolean flag = checkNumber(number);
		if(flag) {
			
			System.out.println("The given number " + number + " is an increasing number");
			
		}else {
			
			System.out.println("The given number " + number + " is unfortunately not an increasing number");
			
		}
		
		s.close();

	}

}
