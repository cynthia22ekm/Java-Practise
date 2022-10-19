//Leetcode Problem


class Solution {
    public int lengthOfLongestSubstring(String s) {

      if( s.length()==1)
        {
            return 1;
        }
        if(s.length()==0)
        return 0;
        char[] letters = s.toCharArray();
        int max=0;
        int size=0;
        for(int i=0;i<letters.length;i++)
        {
            List<Character> substring = new ArrayList<Character>();
            for(int j=i;j<letters.length;j++)
            {

if(!substring.contains(letters[j]))
{
    substring.add(letters[j]);
    size=substring.size();
}
else{
    size=substring.size();
    break;
}
            }
        if(size>max)
        {
            max=size;
        }
        }
          return max;
        
      
    }
}