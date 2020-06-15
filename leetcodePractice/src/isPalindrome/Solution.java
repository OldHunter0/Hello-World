package isPalindrome;

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while (curr.next!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int i=0;
        int j=list.size()-1;
        while (i<j){
            if(!list.get(i).equals(list.get(j)))    return false;
        }
        return true;
    }
}
