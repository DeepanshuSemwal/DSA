package child_sum_bt;

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

    public boolean childSum(Node root)
    {
        if(root==null)
        {
            return true;
        }
        if(root.left==null && root.right==null)
        {
            return true;
        }
        int sum=0;
        if(root.left!=null)
        {
            sum+=root.left.key;
        }
        if(root.right!=null)
        {
            sum+=root.right.key;
        }
        return root.key==sum && childSum(root.left) && childSum(root.right);

    }
}
