package Practise;

import acm.program.ConsoleProgram;

public class Remove_Element extends ConsoleProgram{
	int[] nums={1,2,2,3,4,4,5};
	int val=4;
	int k=0;
	
	public void run()
	{
		removeElement(nums,val);
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				int temp = nums[k];
				nums[k]=nums[i];
				if(temp==0)
				{
					nums[i]=0;
				}
				
				k++;
			}
		}
		for(int j=0;j<nums.length;j++)
		{
			println(nums[j]);
		}
		println(k);
	}
	
	public int[] removeElement(int[] nums,int val)
	{
	for(int i=0;i<nums.length;i++){
		
		if(nums[i]==val)
		{
			nums[i]=0;
		}
	}
	return nums;
	}

}
