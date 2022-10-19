//Leetcode Problem
//231. Power of Two

class Solution {
public boolean isPowerOfTwo(int n) {
boolean result =false;
 if(n==1)
{
    return true;
}
else if(n%2!=0 || n==0)
{
    return false;
}
else{
   result= isPowerOfTwo(n/2);

}
return result;
}
}