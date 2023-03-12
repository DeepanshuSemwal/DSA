package s_127;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class solution {
    public void deleteNode(ListNode node) {
        ListNode cur=node.next;
        node.val=cur.val;
        node.next=cur.next;
    }

}
