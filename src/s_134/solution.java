package s_134;
class ListNode {
    int val;
    s_134.ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, s_134.ListNode next) { this.val = val; this.next = next; }
}
public class solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int a=0;
        int b=0;
        ListNode cur1=headA;
        ListNode cur2=headB;
        while(cur1!=null)
        {
            a++;
            cur1=cur1.next;
        }
        while (cur2!=null)
        {
            b++;
            cur1=cur2.next;
        }

        if(a>b)
        {
          int diff=a-b;
          while(diff-->0)
          {
              headB=headB.next;
          }
        }
        else if(b>a)
        {
            int diff=b-a;
            while(diff-->0)
            {
                headA=headA.next;
            }

        }
        while (headA!=null && headB!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;

    }
}
