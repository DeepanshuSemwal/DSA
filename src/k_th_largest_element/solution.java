package k_th_largest_element;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class solution {
    public static int findKthLargest(int[] nums, int k) {

        int ans=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        while(k-->0)
        {
            ans=pq.poll();
        }
        return ans;

    }

    // using min heap
    public static int findKthLargest1(int []nums,int k)
    {

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++)
        {
            if(pq.peek()<nums[i])
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.poll();
    }


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
