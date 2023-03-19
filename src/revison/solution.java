package revison;

import revison.Node;

import java.util.LinkedList;

class Node
{
    int data;
    revison.Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
public class solution {

    public static Node add(Node head1,Node head2)
    {
         head1=reverse(head1);
         head2=reverse(head2);
        int sum=0;
        int carry=0;
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(head1!=null || head2!=null || carry!=0)
        {
            int val1=0;
            if(head1!=null)
            {
                val1=head1.data;
                head1=head1.next;
            }
            int val2=0;
            if(head2!=null)
            {
                val2=head2.data;
                head2=head2.next;
            }

            sum=head1.data+ head2.data+carry;
            int digit=sum%10;
            // insert
            Node temp=new Node(digit);
            tail.next=temp;
            tail=temp;
            carry=sum/10;


        }
        reverse(dummy.next);
        return dummy.next;

    }
    public static Node reverse(Node head)
    {
        Node prev=null;
        Node cur=head;
        while(cur!=null)
        {
            Node temp=cur.next;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

    public static Node subtract(Node head1,Node head2)
    {
        head1=reverse(head1);
        head2=reverse(head2);
        Node dummy=new Node(-1);
        Node tail=dummy;
        int val1=0;
        int val2=0;
        int diff=0;
        int borrow=0;
        while(head1!=null || head2!=null)
        {
            if(head1!=null)
            {
                val1=head1.data;
                head1=head1.next;
            }
            if(head1!=null)
            {
                val2=head2.data;
                head2=head2.next;
            }


            diff=head1.data- head2.data+borrow;
            if(diff<0)
            {
                diff+=10;
                borrow=-1;
            }
            else
            {
                borrow=0;
            }
            // insert
            Node temp=new Node(diff);
            tail.next=temp;
            tail=temp;

        }
        reverse(dummy.next);
        return dummy.next;
    }

    public static boolean pallindrome(Node head)
    {
        Node middle=middle(head);
        Node temp=middle.next;
        middle.next=null;
        Node cur1=head;
        Node cur2=temp;
        middle.next=reverse(temp);
        while(cur1!=null || cur2!=null)
        {
            if(cur1.data!=cur2.data)
            {
                return false;
            }
            if(cur1!=null)
            {
                cur1=cur1.next;
            }
            if(cur2!=null)
                {
                    cur2=cur2.next;
        }

        }
        temp=middle.next;
        middle.next=reverse(temp);
        return true;
    }
    public static Node middle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }


}
