//Leetcode Problem
//206. Reverse Linked List

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead;
if(head==null|| head.next ==null)
{
    return head;
}
else{
     newHead = reverseList(head.next);
    head.next.next= head;
    head.next = null;
}
return newHead;
        
    }
}