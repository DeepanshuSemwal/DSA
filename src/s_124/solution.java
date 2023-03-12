package s_124;

import java.util.List;

// Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class solution {
    public ListNode reverseList(ListNode head) {

        if(head==null)
        {
            return head;
        }
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null)
        {
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;

        }
        return prev;

    }
}
