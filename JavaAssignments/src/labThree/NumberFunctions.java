package labThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberFunctions {
	
	static int modifyNumber(int number) {
		
		List <Integer> list = new ArrayList <> ();
		List <Integer> ans = new ArrayList <> ();
		int diff = 0;
		while(number != 0) {
			
			list.add(number % 10);
			number /= 10;
			
		}
		
		ans.add(list.get(0));
		
		for(int i = 1; i < list.size() - 1; i++) {
			
			if(list.get(i) > list.get(i+1)) {
				
				diff = list.get(i) - list.get(i+1);
				ans.add(diff);
				
			} else if(list.get(i) < list.get(i+1)) {
				
				diff = list.get(i+1) - list.get(i);
				ans.add(diff);
				
			}
			
		}
		
		Collections.reverse(ans);
		int num = ans.get(0);
		
		for(int i = 1; i < ans.size(); i++) {
			
			num *= 10;
			num += ans.get(i);
			
			
		}
		
		return num;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int number = s.nextInt();
		
		int ans = modifyNumber(number);
		
		System.out.println("The modified number is: " + ans);
		s.close();

	}

}
