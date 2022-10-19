//Leetcode Problem
//2011. Final Value of Variable After Performing Operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("--X"))
            {
                count = count-1;
            }
            else if(operations[i].equals("X--"))
            {
                count = count-1;
            }
            else if(operations[i].equals("X++"))
            {
                count = count+1;
            }
            else{
                count = count+1;
            }
        }
        return count;
    }
}