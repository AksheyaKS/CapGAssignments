package labSix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
	
	static HashMap <Character,Integer> countChars(char [] c){
		
		HashMap <Character,Integer> count = new HashMap <> ();
		
		for(char ch: c) {
			
			if(count.containsKey(ch)) {
				
				count.put(ch, count.get(ch) + 1);
				
			} else {
				
				count.put(ch, 1);
				
			}
			
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.next();
		
		char [] c = str.toCharArray();
		
		HashMap <Character,Integer> count = countChars(c);
		
		System.out.println("The following are the occurences of the characters: ");
		for(Map.Entry<Character,Integer> e: count.entrySet()) {
			
			System.out.println(e.getKey() + " : " + e.getValue());
			
		}
		
		s.close();

	}

}
