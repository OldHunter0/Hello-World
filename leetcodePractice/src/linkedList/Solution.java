package linkedList;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode i=dummy;
        ListNode j=dummy;
        for (int k = 0; k < n; k++) {
            j=j.next;
        }
        while (j.next!=null){
            i=i.next;
            j=j.next;
        }
        i.next=i.next.next;
        return dummy.next;
    }

    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public ListNode reverseList1(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
