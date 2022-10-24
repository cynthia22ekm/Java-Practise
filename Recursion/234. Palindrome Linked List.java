class Solution {
    public ListNode ln;
 public boolean isPalindrome(ListNode head) {
        ln=head;
        return isPalin(ln);
    }
    public boolean isPalin(ListNode nod){
       if(nod==null)
       return true;
       if(isPalin(nod.next))
       {
           if(nod.val == ln.val)
           {
                ln=ln.next;
               return true;
              
           }
           else{
               return false;
           }
       }
       return false;
    }
}