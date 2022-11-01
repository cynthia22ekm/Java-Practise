//1221. Split a String in Balanced Strings

class Solution {
    public int balancedStringSplit(String s) {
        int rCount=0;
        int lCount=0;
        int count=0;
     
            char[] letters = s.toCharArray();
            for(int j=0;j<letters.length;j++)
            {
                if(letters[j]=='R')
                rCount++;
                else
                lCount++;
                 if(rCount==lCount)
            {
count=count+1;
            }

            }
           
        
        return count;
    }
}