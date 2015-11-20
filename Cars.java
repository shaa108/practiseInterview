// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Cars {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int east=0;
		int west=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==0)
			{
				east++;
			}
			else
				
			{
				west++;
			}
			
			
			
			
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<A.length;i++)
		{
		 if(A[i]==0)
		 {
count1++;
		     
		 }
		 else
		 {
	
		     A[i]=count1;
	  
		 }
		    
		    
		}
	
      long sum=0;  
for(int s=0;s<A.length;s++)
{
    
    sum=sum+A[s];
}
	
		

		if(east==0||west==0)
		{
		    return 0;
		}
		//total number of combinations
		
		if(sum>1000000000)
		{
		    
		  return -1;  
		} 
		
	
	
		return (int)sum;
    }
