package labTwo;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		 TreeSet <Integer> ts = new TreeSet <Integer> ();
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number of elements: ");
		 int num = s.nextInt();
		 
		 System.out.println("Enter " + num + " elements");
		 for(int i = 1; i <= num; i++) {
			 
			 ts.add(s.nextInt());
			 
		 }
		 
		 NavigableSet <Integer> tr = ts.descendingSet();
		 
		 System.out.println("The solution array is: " + tr);
		 s.close();
	}

}
