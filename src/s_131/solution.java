package s_131;


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        int count=0;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        if(n==count)
        {
            return head.next;
        }
        cur=head;
        int i=1; // count-n+1

        while(i<count-n)
        {
            cur=cur.next;
            i++;
        }
        // we find the position of the element that is behind the element that will going to delete

        cur.next=cur.next.next;
        return head;
    }


    // approach 2
    // two pointer
    public ListNode removeNthFromEnd2(ListNode head, int n) {

        ListNode slow=head;
        ListNode fast=head;
        while(n-->0)
        {
            fast=fast.next;
        }
        // head will going to change
        if(fast==null)
        {
            return slow.next;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

    }

}
