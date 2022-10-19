//Leetcode Problem
//1773. Count Items Matching a Rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
int count=0;
        for(List list : items)
        {
            if(ruleKey.equals("type"))
            {
               if( list.get(0).equals(ruleValue))
               {
count = count+1;
               }
            }
            else if (ruleKey.equals("color"))
            {
                if(list.get(1).equals(ruleValue))
                {
                    count=count+1;
                }
            }
            else
            {
                 if(list.get(2).equals(ruleValue))
                {
                    count=count+1;
                }
            }
        }
        return count;
    }
}