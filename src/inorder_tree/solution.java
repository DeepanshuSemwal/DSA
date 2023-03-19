package inorder_tree;

class Node
{
    Node left;
    Node right;
    int key;
    Node(int k)
    {
        key=k;
    }
}
public class solution {
    public void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {

    }
}
