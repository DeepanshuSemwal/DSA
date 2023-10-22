package s_138;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
public class solution {
    class Solution
    {
        Node compute(Node head)
        {
            // your code here
            head=reverse(head);
            Node cur=head;
            Node prev=head.next;
            int max=head.data;
            while(head!=null)
            {
                if(head.data>=max)
                {
                    max=head.data;
                    prev=head;
                    head=head.next;
                }

                else
                {
                    prev.next=head.next;
                    head=prev.next;
                }


            }
            head=reverse(cur);
            return head;

        }

        Node reverse(Node head)
        {
            if(head==null || head.next==null)
            {
                return head;
            }
            Node cur=head;
            Node prev=null;
            while (cur!=null)
            {
                Node temp=cur.next;
                cur.next=prev;
                prev=cur;
                cur=temp;
            }
            return prev;
        }
    }


    }
}
