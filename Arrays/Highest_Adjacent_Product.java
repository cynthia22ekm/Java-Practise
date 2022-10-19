package Practise;

import java.util.HashSet;

import acm.program.ConsoleProgram;

public class Highest_Adjacent_Product extends ConsoleProgram{
	
int[] a = {6,2,3,8};
	
	public void run()
	{
		println(solution(a));
	
	}
	
	int solution(int[] statues) {
	     HashSet<Integer> set = new HashSet<Integer>();
	    int max=statues[0];
	    int min=statues[0];
	    int count=0;
	    set.add(statues[0]);
	   
	    for(int i=1;i<statues.length;i++)
	    {
	        if(statues[i]<min){
	            min=statues[i];
	        }
	         if(statues[i]>max){
	            max=statues[i];
	        }
	        set.add(statues[i]);
	    }
	    
	    for(int m=min;m<=max;m++)
	    	    {
	    	println(min);
	    	println(max);
	       if(!set.contains(m))
	       {
	           count++;
	       }
	    }
	    return count;

	}


}
