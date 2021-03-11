package labTwo;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	static int [] getSorted(int a[]) {
		
		int temp = 0, sum = 0;
		
		
		for(int i = 0; i < a.length; i++) {
			
			while(a[i] != 0) {
				
				temp = a[i] % 10;
				sum = (sum * 10) + temp;
				a[i] /= 10;
				
			}
			
			a[i] = sum;
			sum = 0;
		}
		
		Arrays.sort(a);
		return a;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		
		int ar [] = new int[size];
		
		System.out.println("Enter " + size + " elements into the array");
		for(int i = 0; i < size; i++) {
			
			ar[i] = s.nextInt();
			
		}
		
		getSorted(ar);
		
		System.out.println("The solved array is: ");
		for(int i = 0;i < size; i++) {
			
			System.out.print(ar[i] + " ");
			
		}
		
		s.close();

	}

}
