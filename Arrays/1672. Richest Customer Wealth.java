//1672. Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int greatest =0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
              sum = sum + accounts[i][j];
            }
          
            if(sum>greatest)
            {
                greatest = sum;
            }
            sum=0;
        }

        return greatest;
    }
}