package LinkedList2;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)    return l2;
        if(l2==null)    return l1;
        ListNode i = l1;
        ListNode j = l2;
        ListNode head = new ListNode();
        ListNode k = head;
        ListNode pre = null;
        while (i != null || j != null) {
            if(i==null) {
                k.val = j.val;
                k.next =j.next;
                return head;
            }
            else if(j==null){
                k.val=i.val;
                k.next=i.next;
                return head;
            }else if(i.val<j.val) {
                k.val = i.val;
                k.next = new ListNode(0,null);
                i = i.next;
            }
            else {
                k.val = j.val;
                k.next = new ListNode(0,null);
                j = j.next;
            }
            pre=k;
            k=k.next;
        }
        pre.next = null;
        return head;
    }


}
