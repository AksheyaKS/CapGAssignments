package labSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapSort {
	
	static List<Integer> getValues(HashMap <String,Integer> hMap){
		
		List <Integer> list = new ArrayList <> (hMap.values());
		Collections.sort(list);
		
		return list;
		
	}

	public static void main(String[] args) {
		
		HashMap<String, Integer> hMap = new HashMap <> ();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = s.nextInt();
		
		for(int i = 0 ;i < size; i++) {
			
			System.out.println("Enter the string value: ");
			String str = s.next();
			System.out.println("Enter the integer value: ");
			Integer it = s.nextInt();
			
			hMap.put(str, it);
			
		}
		
		List <Integer> sortedList = getValues(hMap);
		
		System.out.println("The sorted list of the hashmap is: " + sortedList);
		s.close();

	}

}
