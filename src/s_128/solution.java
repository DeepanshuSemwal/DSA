package s_128;

import java.util.HashSet;

class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}

public class solution {
    public Node removeDuplicates(Node head)
    {
        // Your code here
//        Node cur=head;
//        HashSet<Integer>set=new HashSet<>();
//        Node prev=null;
//        while(cur!=null)
//        {
//            int cur_val=cur.data;
//            if(set.contains(cur_val))
//            {
//                prev.next=cur.next;
//
//            }
//            else
//            {
//                set.add(cur.data);
//                prev=cur;
//            }
//             cur=cur.next;
//        }
//
//        return head;
        HashSet<Integer>set=new HashSet<>();
        Node cur=head;
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(cur!=null)
        {
            if(!set.contains(cur.data))
            {
                set.add(cur.data);
                tail.next=cur;
                tail=tail.next;
                cur=cur.next;
            }
            else
            {
                cur=cur.next;
            }
        }
        tail.next=null;
        return dummy.next;


    }
}
