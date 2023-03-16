package s_149;


class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class solution {

    static Node subLinkedList(Node l1, Node l2)
    {
        // code here

        // for sum prefer this code
        if(l1==null)
        {
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        l1=reverse(l1);
        l2=reverse(l2);
        Node cur1=l1;
        Node cur2=l2;
        int borrow=0;
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(cur1!=null || cur2!=null)
        {
            int val1= 0;
            int val2=0;
            if(cur1!=null)
            {
                val1=cur1.data;

            }
            if(cur2!=null)
            {
                val2= cur2.data;
            }
            int diff=val1-val2+borrow;
            if(diff<0)
            {
                diff+=10;
                borrow=-1;
            }
            else
            {
                borrow=0;
            }
            tail.next=new Node(diff);
            tail=tail.next;

            if(cur1!=null)
            {
                cur1=cur1.next;
            }
            if(cur2!=null)
            {
               cur2= cur2.next;
            }

        }
        return reverse(dummy.next);



    }
    public static Node reverse(Node head)
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

}
