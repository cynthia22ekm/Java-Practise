class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;
        int carry=0;
       result = sumOfDigits(l1,l2,carry);
       return result;
    }
    public ListNode sumOfDigits(ListNode l1,ListNode l2,int carry)
    {   int sum=0;
    if(l1==null && l2==null && carry==0)
    return null;
        sum= sum+((l1!=null)? l1.val:0 )+((l2!=null)?l2.val:0)+carry;
        carry=sum/10;
        sum=sum%10;
        ListNode result=new ListNode(sum);
        result.next =sumOfDigits((l1!=null)?l1.next:null,(l2!=null)?l2.next:null,carry);
        return result;
    }    
}