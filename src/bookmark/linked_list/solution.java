package bookmark.linked_list;

public class solution {

    public static Node modifyTheList(Node head)
    {
        //10 -> 4 -> 5 -> 3 -> 6
        Node mid=middle(head); // 5
        Node backList=mid.next; // 3 -> 6
        mid.next=null; // 10 -> 4 -> 5 ->null
        backList=reverse(backList); //6 -> 3

        Node cur1=head;
        Node cur2=backList;
        while (cur2!=null)
        {
            int temp=cur1.data;
            cur1.data=cur2.data-cur1.data;
            cur2.data=temp;
            cur1=cur1.next;
            cur2=cur2.next;
        }
        mid.next=reverse(backList);
        return head;
    }

    public static Node middle(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head)
    {
        if(head==null)
        {
            return head;
        }
        Node cur=head;
        Node prev=null;
        while(cur!=null)
        {
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
    }
}
