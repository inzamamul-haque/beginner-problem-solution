
package primenumber;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int i,n,count = 0;
        n=in.nextInt();
        for(i=2;i<n;i++)
        {
        if(n%i==0){
        count++;
        break;  
        }
        }
        if(count==0){
            System.out.println("prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
       
    }
    
}
