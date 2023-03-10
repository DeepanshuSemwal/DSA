package s_126;

import org.w3c.dom.Node;

import java.util.LinkedList;

//* Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // similar to merge sort
     ListNode l1=list1;
     ListNode l2=list2;
     if(l1.val<l2.val)
     {
         ListNode temp=l1;
         l1=l2;
         l2=temp;
     }
     ListNode res=l1;

     while(l1!=null && l2!=null)
     {
         ListNode temp=null;
         while(l1!=null && l1.val<=l2.val)
         {
                temp=l1;
                l1=l1.next;
         }
         temp.next=l2;
         // swapping
         temp=l1;
         l1=l2;
         l2=temp;


     }
     return res;

    }
}
