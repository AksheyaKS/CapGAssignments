package labSix;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	
	static int getSecondSmallest(int a[]) {
		
		Arrays.sort(a);
		return a[1];
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int [] arr = new int [size];
		
		System.out.println("Enter " + size + " elements");
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter element: ");
			arr[i] = s.nextInt();
			
		}
		
		int secondSmallest = getSecondSmallest(arr);
		
		System.out.println("The second smallest element in the array is: " + secondSmallest);
		s.close();

	}
}
