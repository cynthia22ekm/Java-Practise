//1832. Check if the Sentence Is Pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
     List<Character> alphabets = new ArrayList<Character>();
     

char[] letters =sentence.toCharArray();
for(int i=0;i<letters.length;i++)
{
 if( !alphabets.contains(letters[i]))
 {
     alphabets.add(letters[i]);
 }
}
return alphabets.size()==26;
    }
}