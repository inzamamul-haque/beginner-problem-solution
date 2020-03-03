
package arrayduplicatecount;

public class ArrayDuplicateCount {

    public static void main(String[] args) {
       int a[] = {1,2,3,4,1,2,1,2,4,5,6};
	int i,j;
	int count = 0;
	
	for(i=0;i<a.length;i++)
	{
	    for(j=i+1;j<a.length;j++){
	        
	        if(a[i]==a[j]){
	            count++;
	        }
	    }
	}
	 System.out.println(count);
    }
    
}
