
package arrayduplicate;
import java.util.*;

public class ArrayDuplicate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int c;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value");
            int n = sc.nextInt(); //Input from the user;
            System.out.println("Enter the value to store Array");
            int a[] = new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=in.nextInt();//Store data in the array;
	    }
	    int b[] = new int[101]; 
            
	    for(int i=0;i<n;i++){
                c=a[i]; //get current value
                b[c] = b[c] + 1; //store data in the b array and count the value; 
	    }
           
            for(int j=1;j<101;j++){
                    if(b[j]==0) // other value is not showing in the loop if value==0;
                       continue;                      
                   System.out.println(j+ " - " + b[j]);   
                   }
       
                }   
           
}