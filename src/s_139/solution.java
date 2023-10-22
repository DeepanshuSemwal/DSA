package s_139;

class ListNode {
    int data;
    ListNode next;

    ListNode(int x) {
        data = x;
        next = null;
    }

    public class solution {

        // this my solution and it is correct the question state that we have to segregate the even and position linked list
        // orignal : odd linked list should appear first and after that even in this case we have to compre cur.data only
        //
            public ListNode oddEvenList(ListNode head) {
                ListNode evenDummy=new ListNode(-1);
                ListNode evenTail=evenDummy;
                ListNode oddDummy=new ListNode(-1);
                ListNode oddTail=oddDummy;
                ListNode cur=head;
                int count=1;
                while(cur!=null)
                {
                    if(count%2!=0)
                    {
                        oddTail.next=cur;
                        oddTail=oddTail.next;
                    }
                    else
                    {
                        evenTail.next=cur;
                        evenTail=evenTail.next;
                    }
                    count++;
                    cur=cur.next;
                }
                oddTail.next=evenDummy.next;
                evenTail.next=null;
                return oddDummy.next;
            }









//        Node divide(int N, Node head) {
//            // code here
//            Node odd_head = null;
//            Node odd_tail = null;
//            Node even_head = null;
//            Node even_tail = null;
//            while (head != null) {
//                if (head.data % 2 == 0) {
//                    if (even_head == null) {
//                        even_head = head;
//                        even_tail = head;
//                        head = head.next;
//                    } else {
//                        even_tail.next = head;
//                        even_tail = even_tail.next;
//                        head = head.next;
//                    }
//
//                } else {
//                    if (odd_head == null) {
//                        odd_head = head;
//                        odd_tail = head;
//                        head = head.next;
//                    } else {
//                        odd_tail = head;
//                        odd_tail.next = odd_tail.next;
//                        head = head.next;
//                    }
//                }
//
//
//            }
//            if (even_head == null) {
//                return odd_head;
//            }
//            if (odd_head == null) {
//                return even_head;
//            }
//            odd_head.next=null;
//            odd_tail.next=even_head;
//            return odd_head;
//
//
//        }
    }
}
