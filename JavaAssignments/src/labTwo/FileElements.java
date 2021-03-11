package labTwo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileElements {
	
	public static void main(String args[])throws IOException {
		
		int nl = 1,nw = 0;           
        char ch;
        
        Scanner s = new Scanner(System.in);
        
        //System.out.print("\nEnter File name: ");
        String str = "D:\\Old C user datas\\Desktop\\AksheyaKS\\JavaAssignments\\src\\labTwo\\Test.txt";
        
        FileInputStream f = new FileInputStream(str); 
        int n = f.available();
        
        for(int i = 0; i < n; i++){
        	
        	ch = (char) f.read();
            if(ch =='\n') {
            	
            	nl++;
            	
            } else if(ch == ' ') {
            	
            	nw++;
                  
            }
                                                       
        }
        
        System.out.println("\nNumber of lines : " + nl);
        System.out.println("\nNumber of words : " + (nl+nw));
        System.out.println("\nNumber of characters : " + n);
        
        s.close();
        f.close();

    }

}
