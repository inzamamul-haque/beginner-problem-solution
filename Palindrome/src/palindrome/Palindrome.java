
package palindrome;

import java.util.*;

public class Palindrome {

   
    public static void main(String[] args) {
        String str, rev = "";
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String Value");
        str = input.nextLine();
        int length = str.length();
        
        for( i = length-1; i>=0; i-- ){
        rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
    
}
