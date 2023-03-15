package s_146;

class Node {
      int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }
public class solution {

    // doubt

    public Node addTwoNumbers(Node l1, Node l2) {

        l1=reverse(l1);
        l2=reverse(l2);
        Node ans=add(l1, l2);
        ans=reverse(ans);
        return ans;


    }
    public Node reverse(Node head)
    {
        Node prev=null;
        Node cur=head;
        while(cur!=null)
        {
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public void insertTail(Node head, Node tail, int val)
    {
        Node temp=new Node(val);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            tail.next=temp;
            tail=temp;
        }

    }
    public Node add(Node first, Node second)
    {
        Node ans_head=null;
        Node ans_tail=null;
        int carry=0;
        while(first!=null || second!=null || carry!=0)
        {
            int val1=0;
            if(first!=null)
            {
                val1= first.val;
            }
            int val2=0;
            if(second!=null)
            {
                val2=second.val;
            }
            int sum= val1+val2+carry;
            int digit=sum%10;
             insertTail(ans_head,ans_tail,digit);
            carry=sum/10;
            if(first!=null)
            {
                first=first.next;
            }
            if(second!=null)
            {
                second=second.next;
            }

        }
        return ans_head;
    }
}
