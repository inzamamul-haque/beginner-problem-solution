
package arraymaxmin;

import java.util.Scanner;
public class ArrayMaxMin {

  public static void main(String[] args) {
      int []a = new int[100];
      int i,max,min,n,sum=0,avg;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the elemnet");
      n=input.nextInt();
      for(i=0;i<n;i++)
      {
      System.out.printf("element - %d: ",i);
      a[i]=input.nextInt();
      sum= sum+a[i];
      }
      max=a[0];
      min=a[0];
      for(i=1;i<n;i++){
      
      if(max<a[i]){
      max = a[i];
      
      }
      if(min>a[i]){
      min = a[i];
      }
      
      }
      avg= sum/i;
      System.out.println("Array length "+a.length);
      System.out.println("Maximum "+max);
      System.out.println("Minimum "+min);
      System.out.println("Sumation "+sum);
      System.out.println("Average "+avg);
     
       
    }
    
}
