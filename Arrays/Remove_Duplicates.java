package Practise;

import acm.program.ConsoleProgram;

public class Remove_Duplicates extends ConsoleProgram {
	
	public void run(){
		int[] nums = {1,1,2,2,2,3,3,3,4,5,5,6,7};
		int k=1;
		removeDuplicates(nums);
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				nums[k]=nums[i];
				nums[i]=0;
				k++;	
			}
			
		}
		for(int j=0;j<nums.length;j++)
		{
			println(nums[j]);
		}
		println(k);
	}
	
	public int[] removeDuplicates(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j] && nums[i]!=0 && nums[j]!=0)
				{
					nums[j]=0;
					
				}
			}
		}
		return nums;
		
		
	}

}
