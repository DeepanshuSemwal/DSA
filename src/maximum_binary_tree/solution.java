package maximum_binary_tree;

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

    public int max(Node root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.key, Math.max(max(root.left),max(root.right)));
    }
}
