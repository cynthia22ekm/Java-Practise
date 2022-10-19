package Practise;

import acm.program.ConsoleProgram;

public class Merge_Sorted_Array extends ConsoleProgram {
	int[] num1={1,3,3,4,0,0,0,0};
	int[] num2={1,2,6,7};
	int m =4;
	int n=4;
	
	public void run()
	{
		merge(num1,m,num2,n);
	}
	
	public void merge(int[] num1, int m, int[] num2, int n){
		
		
		for(int i=m;i<(m+n);i++){		
		num1[i]=num2[i-m];	
		}
		
		int min=num1[0];
		for(int i=0;i<(m+n)-1;i++)
		{
			
			for(int j=i+1;j<(m+n);j++){     
				
				if(num1[j]<num1[i])          
				{
					int temp = num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
				
				}
				
			}
		
			
		}
		for(int k=0;k<(m+n);k++)
		{
			println(num1[k]);
		}
		
	}

}
