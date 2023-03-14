package s_137;

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}




public class solution {

    public static Node reverseDLL(Node  head)
    {
        //Your code here
        Node temp=null;

        Node current=head;

        while(current!=null){

            temp=current.prev;

            current.prev=current.next;

            current.next=temp;

            current=current.prev;

        }

        if(temp!=null){

            head=temp.prev;

        }

        return head;

    }
}
