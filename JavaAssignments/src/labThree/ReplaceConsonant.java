package labThree;

import java.util.Scanner;

public class ReplaceConsonant {
	
	static String alterString(String str) {
		
		String st = str.toLowerCase();
		char arr [] = st.toCharArray();
		char ans [] = new char [arr.length];
		
		boolean vowel = false;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i'|| arr[i] == 'o' || arr[i] == 'u') {
				
				vowel = true;
				
			} else {
				
				vowel = false;
				
			}
			
			if(!vowel) {
				
				if (arr[i] == 'z') { 
					
                    ans[i] = 'b'; 
                } else {
                	
                	ans[i] = (char) (arr[i] + 1);
                	
                }
				
			} else {
				
				ans[i] = arr[i];
				
			}
			
		}
		
		return String.valueOf(ans);
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str = s.next();
		
		String ans = alterString(str);
		System.out.println("The altered string is: " + ans);
		s.close();

	}

}
