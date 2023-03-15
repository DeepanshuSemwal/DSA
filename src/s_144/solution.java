package s_144;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
}

public class solution {

    // doubt on this code
    static Node mergeSort(Node head)
    {
        // add your code here

        // we are using recursion
        if(head==null && head.next==null)
        {
            return head;
        }
        Node mid=middile(head);
        Node left=head;
        Node right= mid.next;
        mid.next=null;
        left=mergeSort(left);
        right=mergeSort(right);
        Node result=merge(left,right);
        return result;



    }
    static Node middile(Node head)
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
    static Node merge(Node left,Node right)
    {
        if(left==null)
        {
            return right;
        }
        if(right==null)
        {
            return left;
        }
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(left!=null && right!=null)
        {
            if(left.data<right.data)
            {
                tail.next=left;
                tail=left;
                left=left.next;
            }
            else
            {
                tail.next=right;
                tail=right;
                right=right.next;
            }
        }
        while (left!=null)
        {
            tail.next=left;
            tail=left;
            left=left.next;
        }
        while (right!=null)
        {
            tail.next=right;
            tail=right;
            right=right.next;
        }
        return dummy.next;
    }


}
