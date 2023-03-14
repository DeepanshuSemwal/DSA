package s_139;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    public class solution {

        Node divide(int N, Node head) {
            // code here
            Node odd_head = null;
            Node odd_tail = null;
            Node even_head = null;
            Node even_tail = null;
            while (head != null) {
                if (head.data % 2 == 0) {
                    if (even_head == null) {
                        even_head = head;
                        even_tail = head;
                        head = head.next;
                    } else {
                        even_tail.next = head;
                        even_tail = even_tail.next;
                        head = head.next;
                    }

                } else {
                    if (odd_head == null) {
                        odd_head = head;
                        odd_tail = head;
                        head = head.next;
                    } else {
                        odd_tail = head;
                        odd_tail.next = odd_tail.next;
                        head = head.next;
                    }
                }


            }
            if (even_head == null) {
                return odd_head;
            }
            if (odd_head == null) {
                return even_head;
            }
            odd_head.next=null;
            odd_tail.next=even_head;
            return odd_head;


        }
    }
}
