package s_213;

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

    public Node mirror(Node root)
    {
        if(root!=null)
        {
            mirror(root.left);
            mirror(root.right);
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        return root;


    }
}
