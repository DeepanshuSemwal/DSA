package s_242;

class Node
{
    Node left;
    Node right;
    int data;
    Node(int d)
    {
        data=d;
    }
}
public class solution {
    int minValue(Node root) {

        if(root==null)
        {
            return -1;
        }
        while(root.left!=null)
        {
            root=root.left;
        }
        return root.data;

    }

    // recursive
    int MinValue(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.left==null)
        {
            return root.data;
        }
        return MinValue(root.left);
    }

}
