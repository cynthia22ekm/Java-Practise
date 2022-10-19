//Leetcode Problem
//2114. Maximum Number of Words Found in Sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++)
        {
String[] sentence = sentences[i].split(" ");
if(sentence.length > max)
max = sentence.length;
        }
return max;
        
    }
}