//Leetcode Problem
//203. Remove Linked List Elements

class Solution {
    public ListNode removeElements(ListNode head, int val) {
    ListNode result=head;
if(head==null)
{
    return null;
}
if(head.val == val)
{
    return removeElements(head.next,val);
}
else{
result.next = removeElements(head.next,val);
}
return result;
    }
}