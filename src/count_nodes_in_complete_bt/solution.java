package count_nodes_in_complete_bt;

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

    // efficient approach
    public int count(Node root)
    {
        Node cur=root;
        int lh=0;
        int rh=0;
        while(cur.left!=null)
        {
            lh++;
            cur=cur.left;
        }
        cur=root;
        while (cur.right!=null)
        {
            rh++;
            cur=cur.right;
        }
        if(lh==rh)
        {
            return (int)Math.pow(2,lh)-1;
        }
        return 1+count(root.left)+count(root.right);


    }

    //navie approach
    public int count1(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }
}
