package Practise;

import acm.program.ConsoleProgram;

public class Search_Insert_Position extends ConsoleProgram {
	
	public void run()
	{
		int[] nums={1,3,5};
        int target =2;
        if(target==1)
        {
        	println(0);
        }
        else
        {
		int position =searchInsert(nums,target);
		println(position);
        }
		
	}
		public int searchInsert(int[] nums,int target)
		{
			int position=0;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]==target)
				{
				position= i;
				break;
				}
				if(target<nums[i])
				{
					position=i;
					break;
				}
				if(target>nums[nums.length-1])
				{
					position=nums.length;
					break;
				}
			}
			return position;
			
		}
	

}
