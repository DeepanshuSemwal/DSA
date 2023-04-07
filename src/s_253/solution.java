package s_253;


class Node {
    int data;
    Node left, right,next;

    public Node(int data){
        this.data = data;
    }
}

public class solution {
    // note: next pointer is given in the Node class
    Node prev=null;
    public void populateNext(Node root){
        //code here
        if(root==null)
        {
            return;
        }
        populateNext(root.left);
        if(prev!=null)
        {
            prev.next=root;
        }
        prev=root;
        populateNext(root.right);
    }

}
