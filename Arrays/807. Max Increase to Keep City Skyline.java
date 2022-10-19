//Leetcode Problem
//807. Max Increase to Keep City Skyline

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int diff=0;    
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                int max1=grid[i][j];
                int max2=grid[i][j];
                 int k=0;
                  int m=0;
               while(k<grid.length)
               {
                   if(max1<grid[k][j])
                   {
                    max1=grid[k][j];
                   }
                   k++;
               }
               while(m<grid.length)
               {
                   if(max2<grid[i][m])
                   {  
                       max2=grid[i][m];
                   }
                   m++;
               }
               if(max1 <max2)
               {
                   diff = diff + (max1 -grid[i][j]);
               }
               else
               {
                   diff = diff + (max2 -grid[i][j]); 
               }
               System.out.println(diff);
            }
        }
        return diff;
    }
}