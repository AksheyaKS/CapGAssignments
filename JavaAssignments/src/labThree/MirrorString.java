package labThree;

import java.util.Scanner;

public class MirrorString {
	
	static String getImage(String str) {
		
		String reverse = new StringBuffer(str).reverse().toString();
		
		String image = str + "|" + reverse;
		
		return image;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str = s.next();
		
		String image = getImage(str);
		
		System.out.println("The mirror image is: " + image);
		s.close();

	}

}
