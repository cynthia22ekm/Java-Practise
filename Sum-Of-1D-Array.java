//Leetcode Problem
//1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
          result[i]=0;
           for(int j=0;j<=i;j++)
           {
 result[i] = result[i]+ nums[j];
           }
           
        }
        return result;
    }
}