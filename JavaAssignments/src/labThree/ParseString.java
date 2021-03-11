package labThree;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ParseString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string of integers: ");
		String str = s.next();
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			
			int n = 0;
			n = Integer.parseInt(st.nextToken());
			System.out.println("Number is: "+n);
			sum += n;
			
		}
	
		System.out.println("The sum of the integers is: " + sum);
		
		s.close();

	}

}
