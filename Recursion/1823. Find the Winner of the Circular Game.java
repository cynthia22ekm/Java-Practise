//Leetcode Problem

class Solution {
    public int findTheWinner(int n, int k) {
        int l=0;
List<Integer> numbers = new ArrayList<Integer>();
for(int i=1;i<=n;i++)
{
    numbers.add(i);
}
int result  = solution(numbers,k,l);
return result;
    }

public int solution(List<Integer> numbers, int k,int index)
    {

if(numbers.size() ==1)
{
    return numbers.get(0);
}
index=index+k-1;
while(index>=numbers.size()){
            index=index-numbers.size();
        }
numbers.remove(index);
int result = solution(numbers,k,index);

 return result;
    }
   
}