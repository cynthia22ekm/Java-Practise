package Practise;

import acm.program.ConsoleProgram;

public class Large_Integer extends ConsoleProgram{
	
	int[] digits= {2,4,3};
	public void run()
	{
		plusOne(digits);
		for(int i=0;i<digits.length;i++){
			println(digits[i]);
		}
	}
	
	public int[] plusOne(int[] digits)
	{
		int num=digits[0];
		int[] result = {};
		for(int i=1;i<digits.length;i++)
		{
			num=num*10+digits[i];
			
		}
		int plusOne = num+1;
		println(plusOne);
		for(int j=digits.length-1;j>=0;j--)
		{
		digits[j] = plusOne%10;
		plusOne =  plusOne/10;
		}
		
		return digits;
		
	}

}
