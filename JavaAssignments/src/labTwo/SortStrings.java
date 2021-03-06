package labTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortStrings {
	
	static List<String> getSorted(List<String> list){
		
		List <String> sortedList = new ArrayList <> ();
		boolean flag = false;
		
		if(list.size() % 2 == 0) {
			
			flag = true;
			
		}
		
		Collections.sort(list);
		
		if(flag) {
			
			for(int i = 0; i < (list.size()/2); i++) {
				
				String str = list.get(i);
				sortedList.add(str.toUpperCase());
				
			}
			
			for(int i = (list.size()/2); i < list.size(); i++) {
				
				String str = list.get(i);
				sortedList.add(str.toLowerCase());
				
			}
			
		} else {
			
			for(int i = 0; i < (list.size()/2) + 1; i++) {
				
				String str = list.get(i);
				sortedList.add(str.toUpperCase());
				
			}
			
			for(int i = (list.size()/2) + 1; i < list.size(); i++) {
				
				String str = list.get(i);
				sortedList.add(str.toLowerCase());
				
			}
			
		}
		
		return sortedList;
		
	}

	public static void main(String[] args) {
		
		List <String> list = new ArrayList <> ();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num = s.nextInt();
		 
		System.out.println("Enter " + num + " elements");
		for(int i = 1; i <= num; i++) {
			 
			list.add(s.next());
			 
		}
		
		s.close();
		
		List <String> sortedList = getSorted(list);
		
		for(String str: sortedList) {
			
			System.out.println(str);
			
		}

	}

}
