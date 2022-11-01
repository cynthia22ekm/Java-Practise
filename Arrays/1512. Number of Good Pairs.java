//1512. Number of Good Pairs

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(j!=i)
                {
if(nums[i]==nums[j])
{
    count=count+1;
}
                }
            }
        }
return count;
    }
}