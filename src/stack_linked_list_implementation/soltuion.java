package stack_linked_list_implementation;

public class soltuion {

}

class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data=d;
    }
}

class Mystack
{
    Node head;
    int data;
    int size;
    Mystack()
    {
        head=null;
        size=0;
    }
    public void push(int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }
    public int pop()
    {
        if(head==null)
        {
            return Integer.MIN_VALUE;
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }
    public int peek()
    {
        if(head==null)
        {
            return Integer.MIN_VALUE;
        }
        return head.data;
    }
    public int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        return head==null;
    }

}
