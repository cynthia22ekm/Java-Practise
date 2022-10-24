class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
ListNode result;
     int val1= list1.val;
     int val2= list2.val;

     if(val1<val2)
     {
    result =  list1;
    result.next=mergeTwoLists(list1.next,list2);
     }
    else
    {
    result= list2;
    result.next=mergeTwoLists(list1,list2.next);
    }
  

     return result;
    }
}