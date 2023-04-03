package floor_bst;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        data=d;
    }
}
public class solution {

    public static Node floor(Node root,int x)
    {
        Node res=null;
        while (root!=null)
        {
            if(root.data==x)
            {
                return root;
            }
            if(root.data>x)
            {
                root=root.left;
            }
            else if(root.data<x)
            {
                res=root;
                root=root.right;
            }

        }
        return res;
    }
}
