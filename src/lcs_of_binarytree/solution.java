package lcs_of_binarytree;

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

    public Node lcs(Node root,Node p,Node q)
    {
        if(root==null || p==null || q==null)
        {
            return root;
        }
        Node left=lcs(root.left,p,q);
        Node right=lcs(root.right,p,q);
        // result
        if(left==null)
        {
            return right;
        }
      else if(right==null)
        {
            return left;
        }
        else
        {
            // both left and right are not null then we get the given result
            return root;
        }
    }
}
