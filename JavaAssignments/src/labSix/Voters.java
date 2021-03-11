package labSix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Voters {
	
	static List <Integer> votersList(HashMap <Integer,Integer> people){
		
		List <Integer> voters = new ArrayList <> ();
		Set <Integer> id = people.keySet();
		
		for(int i : id) {
			
			if(people.get(i) > 18) {
				
				voters.add(i);
				
			} 
			
		}
		
		return voters;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of people: ");
		int num = s.nextInt();
		
		HashMap <Integer,Integer> people = new HashMap <> ();
		
		for(int i = 0; i < num; i++) {
			
			System.out.println("Enter the voter id: ");
			int id = s.nextInt();
			System.out.println("Enter the age: ");
			int age = s.nextInt();
			
			people.put(id, age);
			
		}
		
		List <Integer> voters = votersList(people);
		
		System.out.println("The following ids are the ids of the eligible people: " + voters);
		s.close();

	}

}
