//Leetcode Problem
//1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}