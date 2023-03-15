package pallindrome_linked_list;


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middile(head);
        ListNode temp=mid.next;
        mid.next=reverse(temp);
        ListNode cur1=head;
        ListNode cur2=mid.next;
        while(cur2!=null)
        {
            if(cur1.val!=cur2.val)
            {
                return false;
            }
            cur1=cur1.next;
            cur2=cur2.next;

        }
        // to return original list
        temp=mid.next;
        mid.next=reverse(temp);
        return true;

    }

    public ListNode reverse(ListNode head)
    {
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
    public ListNode middile(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
