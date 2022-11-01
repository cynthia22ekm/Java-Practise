//1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatest = new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
           max =Math.max(candies[i],max);
        }

        for(int j=0;j<candies.length;j++)
        {
            if(candies[j]+ extraCandies < max)
            {
                greatest.add(false);
            }
            else
            {
                greatest.add(true);
            }
        }
        return greatest;
    }
}