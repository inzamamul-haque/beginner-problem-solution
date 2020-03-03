
package arraysecondmax;
import java.util.*;

public class ArraySecondMax {

    public static void main(String[] args) {
       int n,largest1,largest2,largest3;
       int []a = new int[100];
       Scanner input = new Scanner(System.in);
       n=input.nextInt();
       for(int i=0;i<n;i++){
       a[i]=input.nextInt();
       }
       largest1 = a[0];
       largest2 = a[0];
       largest3 = a[0];
       
       for(int i=1;i<n;i++){
       if(largest1<a[i]){
       largest1 = a[i];
       }
       }
       for(int i=1;i<n;i++){
       if(largest2<a[i] && largest1>a[i]){
       largest2 = a[i];
       }
       }
      for(int i=1;i<n;i++){ 
       if(largest3<a[i] && largest2>a[i]){
        largest3 = a[i];
      }
      }
       System.out.println("Largest Number: "+largest1);
       System.out.println("2nd Largest Number: "+largest2);
       System.out.println("3rd Largest Number: "+largest3);
       
    }
}