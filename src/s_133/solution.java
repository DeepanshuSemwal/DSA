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
        while(fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(slow!=fast)
        {
            return;
        }
        if(slow==head)
        {
            while(fast.next!=slow)
                fast=fast.next;
            fast.next=null;
        }
        else if(slow==fast)
        {
            slow=head;
            while(slow.next!=fast.next)
            {
                slow=slow.next;
                fast=fast.next;
            }
            fast.next=null;
        }
        return;

    }
}
