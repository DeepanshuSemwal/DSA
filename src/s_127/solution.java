package s_127;

class ListNode {
    int val;
    s_127.ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, s_127.ListNode next) { this.val = val; this.next = next; }
}

public class solution {
    public void deleteNode(ListNode node) {
        ListNode cur=node.next;
        node.val=cur.val;
        node.next=cur.next;
    }
}
