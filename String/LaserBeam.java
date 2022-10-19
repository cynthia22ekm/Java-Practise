package Practise;

import acm.program.ConsoleProgram;

public class LaserBeam extends ConsoleProgram{
	String bank[] = {"011001","000000","010100","001000"};
	int[] rowCount = new int[bank.length];
	int beamCount =0;
	
	public void run()
	{
		println(numberOfBeams(bank));
	}
	
	public int numberOfBeams(String[] bank) {
	
	for(int i=0;i<bank.length;i++)
	        {
	            int count=0;
	            for(int j=0;j<bank[i].length();j++)
	            {
	                if(bank[i].charAt(j)=='1')
	                {
	                     count++;
	                }
	            }
	rowCount[i]=count;
	        }
	        for(int m=0;m<rowCount[m];)
	        {
	            if(rowCount[m]!=0)
	            {
	            	println("Entered frts loop");
	            for(int n=0;n<rowCount[m+1];n++)
	            {
	                if(rowCount[m+1]!=0)
	                {
	              beamCount= beamCount+1;  
	              m=m+1;
	            }
	            }
	        }
	        }
	       return beamCount; 
	    }
}



