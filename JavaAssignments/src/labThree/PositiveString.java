package labThree;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = s.next();
		
		char check [] = str.toCharArray();
		char arr [] = str.toCharArray();
		Arrays.sort(arr);
		
		for(int i = 0; i < str.length(); i++) {
			
			if(arr[i] != check[i]) {
				
				flag = false;
				
			}
			
		}
		
		if(flag) {
			
			System.out.println("The given string is positive");
			
		} else {
			
			System.out.println("The given string is not positive");
			
		}
		
		s.close();

	}

}
