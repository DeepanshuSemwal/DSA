package height_binarytree;


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

    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
