package s_132;

import java.util.List;

class ListNode {
    int val;
    s_132.ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, s_132.ListNode next) {
        this.val = val;
        this.next = next;
    }


}

public class solution {
    public void reorderList(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode second=reverse(slow.next);
        slow.next=null;
        ListNode first=head;
        while(second!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }

    }
    public ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
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
