package implementation_queue_using_linked_list;

import java.util.LinkedList;

public class Queue {

    int cap;
    int size;
    Queue(int c)
    {
        cap=c;
        size=0;
    }
   Node front=null;
    Node rear=null;
    public void Enquqeue(int x)
    {
        Node temp=new Node(x);
        size++;
        if(front==null)
        {
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
    }
    public void Dequeue()
    {
        if(front==null)
        {
            return;
        }
        front=front.next;
        size--;
        if(front==null) // it means we have deleted the last item
        {
            rear=null;
        }
    }
    public int getFront()
    {
        if(front==null)
        {
            return -1;
        }
        return front.data;

    }

    public int getRear()
    {
        if(front==null)
        {
            return -1;
        }
        return rear.data;

    }
    public int getSize()
    {
        return size;
    }

}

class Node
{
    Node next;
    int data;
    Node(int x)
    {
        data=x;
    }
}
