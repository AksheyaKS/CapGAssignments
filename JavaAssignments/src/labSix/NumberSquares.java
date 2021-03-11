package labSix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberSquares {
	
	static HashMap <Integer,Integer> getSquares(int arr []){
		
		HashMap <Integer,Integer> squares = new HashMap <> ();
		
		for(int n: arr) {
			
			if(squares.containsKey(n)) {
				
				continue;
				
			} else {
				
				int square = n * n;
				squares.put(n, square);
				
			}
			
		}
		
		return squares;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = s.nextInt();
		
		int arr [] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter element: ");
			arr[i] = s.nextInt();
			
		}
		
		HashMap <Integer,Integer> squares = getSquares(arr);
		
		System.out.println("The following are the squares of the integers: ");
		for(Map.Entry<Integer,Integer> e: squares.entrySet()) {
			
			System.out.println(e.getKey() + " : " + e.getValue());
			
		}
		
		s.close();

	}

}
