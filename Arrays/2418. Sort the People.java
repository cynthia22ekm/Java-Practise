//2418. Sort the People
////Leetcode Problem

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       HashMap<Integer,String> map = new HashMap<Integer,String>(); 
       int m= heights.length-1;
       for(int i=0;i<names.length;i++)
       {
           map.put(heights[i],names[i]);
       }
       Arrays.sort(heights);
       for(int j=0;j<heights.length;j++)
       {
           names[j]=map.get(heights[m]);
        m--;
       }
return names;
    }
}