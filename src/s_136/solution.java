package s_136;

 class Node {
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
public class solution {
     //  effcient approach
    public void zigzag(Node head)
    {
        Node cur=head;
        boolean flag=true;

        while(cur!=null && cur.next!=null)
        {
            if(flag==true)
            {
                if(cur.data>cur.next.data)
                {
                    int temp=cur.data;
                    cur.data=cur.next.data;
                    cur.next.data=temp;
                }
            }
            else
            {
                if(cur.data<cur.next.data)
                {
                    int temp=cur.data;
                    cur.data=cur.next.data;
                    cur.next.data=temp;
                }
            }
            cur=cur.next;
            flag=!(flag); //changing flag
        }
    }
}
