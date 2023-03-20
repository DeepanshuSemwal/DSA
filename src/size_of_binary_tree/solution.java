package size_of_binary_tree;

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

    public int size(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
}
