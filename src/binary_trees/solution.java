package binary_trees;

class Node
{
    Node right;
    Node left;
    int key;
    Node(int k)
    {
        key=k;
    }
}
public class solution {

    public static void main(String[] args) {
        Node root=new Node(30);
        root.left=new Node(40);
        root.right=new Node(50);
        root.left.left=new Node(70);
        root.right.left=new Node(60);
        root.right.right=new Node(80);

    }

}
