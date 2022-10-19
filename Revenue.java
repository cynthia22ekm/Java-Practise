package Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import acm.program.ConsoleProgram;

public class Revenue extends ConsoleProgram {
	String[][] logs = {{"supply","item1","1","100"},
			{"supply","item2","2","60"},
			{"sell","item1","1"},
			{"sell","item2","2"},
			{"return","item2","1","60","40"},
			{"sell","item2","1"}};
	
	int k=0;
	List<Integer> revenues = new ArrayList<Integer>();
	HashMap<String,int[]> supply = new HashMap<String,int[]>();
	
	public void run()
	{
		
		println(solution(logs)[2]);
	}
	
	public int[] solution(String[][] logs)
	{
		int j=0;
		for(int i=0;i<logs.length;i++)
		{	
				if(logs[i][j].equals("supply"))
				{
					supply.put(logs[i][j+1],new int[2]);	
					supply.get(logs[i][j+1])[0]=Integer.parseInt(logs[i][j+2]);
					supply.get(logs[i][j+1])[1]=Integer.parseInt(logs[i][j+3]);	
			}
				else if(logs[i][j].equals("sell"))
				{
				String item = logs[i][j+1];
				int  quantity = Integer.parseInt(logs[i][j+2]);	
				int remainingQuantity = supply.get(item)[0]-quantity;
				supply.get(item)[0]=remainingQuantity;
				int revenue = supply.get(item)[1] *quantity;
				revenues.add(revenue);	
				}
				else
				{
					String item = logs[i][j+1];
					supply.get(item)[0]=supply.get(item)[0]+Integer.parseInt(logs[i][j+2]);
					supply.get(item)[1]=Integer.parseInt(logs[i][j+4]);
				}
		}
		int[] result = new int[revenues.size()];
		for(int l=0;l<revenues.size();l++)
		{
			result[l] = revenues.get(l);
			println(result[l]);
		}
		return result;
		
	}

}
