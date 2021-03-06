package labSix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Medals {
	
	static HashMap <Integer,String> getStudents(HashMap <Integer,Integer> stuDeets){
		
		HashMap <Integer,String> medal = new HashMap <> ();
		Set <Integer> st = stuDeets.keySet();
		
		for(Integer in: st) {
			
			Integer marks = stuDeets.get(in);
			
			 if(marks >= 90){
				 
				 medal.put(in,"Gold");
				 
             } else if(marks >= 80 ){
             
                   medal.put(in,"Silver");
             } else if(marks >= 70) {
             
                   medal.put(in,"Bronze");
             }
			
		}
		
		return medal;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int size = s.nextInt();
		
		HashMap <Integer,Integer> stuDeets = new HashMap <> ();
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter the student id: ");
			int id = s.nextInt();
			System.out.println("Enter the student mark: ");
			int mark = s.nextInt();
			
			stuDeets.put(id, mark);
			
		}
		
		HashMap <Integer,String> medal = getStudents(stuDeets);
		
		System.out.println("The following are the students with medal details: ");
		for(Map.Entry<Integer,String> e: medal.entrySet()) {
			
			System.out.println(e.getKey() + " : " + e.getValue());
			
		}
		
		s.close();

	}

}
