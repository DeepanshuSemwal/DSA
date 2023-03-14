package s_135;
class Node {
    public int val;
    //public Node prev;
    public Node next;
    public Node child;
}
public class solution {
    public Node flatten(Node head) {
        // this code is for singlly linked list
        Node tail=head;
        Node cur=head;
        Node temp=null;
        if(head==null)
        {
            return null;
        }
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        while(cur!=tail)
        {
            if(cur.child!=null)
            {
                tail.next=cur.child;
                temp=cur.child;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                tail=temp;
            }
            cur=cur.next;
        }
        return head;

    }
}
