package s_133;

class Node
{
    int data;
    s_133.Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}

public class solution {

    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow=head;
        Node fast=head;
        if(head==null || head.next==null)
        {
            return;
        }
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                break;
            }

        }
        if(fast!=null)
        {
            return;
        }
        slow=head;
        while(slow.next!=fast.next)
        {
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=null;



    }
    public static Node detect(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return slow;
            }
        }
        return null;
    }
}
