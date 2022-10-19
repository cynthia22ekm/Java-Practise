//Leetcode Problem
//1528. Shuffle String


class Solution {
    public String restoreString(String s, int[] indices) {
        String result ="";
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
map.put(indices[i],s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++)
        {
            result = result + map.get(i);
        }
        return result;
    }
}