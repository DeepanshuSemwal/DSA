package ceiling_bst;

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
    public static Node ceil(Node root,int x)
    {
        Node res=null;
        while (root!=null)
        {
            if(x==root.data)
            {
                return root;
            }
            if(root.data>x)
            {
                res=root;
                root=root.left;
            }
            else if(root.data<x)
            {
                root=root.right;
            }
        }
        return res;
    }



}
