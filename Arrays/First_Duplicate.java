package Practise;

import acm.program.ConsoleProgram;

public class First_Duplicate extends ConsoleProgram {
	int[] a = {2,4,3,5,1};
	
	public void run()
	{
		println(solution(a));
	
	}
	
	int solution(int[] a) {
	    int result[] =new int[10];
	    int index[]=new int[10];
	    int k=0;
	    int returnPos =0;
	    
	    for(int i=0;i<a.length;i++)
	    {   
	        for(int j=i+1;j<a.length;j++)
	        {
	            if(a[i]==a[j])
	            {
	                 index[k]=j;   
	                 result[k]=a[i];
	                 k++;
	            } 
	        }
	       
	    
	    }
	    int min=index[0];
	    for(int m=0;m<k;m++){
	
	       if(index[m]<min)
	       {
	           min=index[m];
	           returnPos=m;
	           
	       }
	    }
	
		    if(result[returnPos] == 0)
		    	return -1;
		    else
		    	return result[returnPos];

	}


}
