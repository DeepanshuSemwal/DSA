package check_for_balance;

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
public class soultion {

    public int check_balance(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=check_balance(root.left);
        if(lh==-1)
        {
            return -1;
        }
        int rh=check_balance(root.right);
        if(rh==-1)
        {
            return -1;
        }
        if(Math.abs(lh-rh)>1)
        {
            return -1;
        }
        else
        {
            // return height
            return Math.max(lh,rh)+1;
        }
    }
}
