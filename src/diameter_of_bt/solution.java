package diameter_of_bt;

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


    // navie approach
    public int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }

       int d1=1+height(root.left)+height(root.right);
        int d2=height(root.left);
        int d3=height(root.right);
        return Math.max(d1,Math.max(d2,d3));
    }

    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+height(root.left)+height(root.right);
    }

    // effcient approach
    int res=Integer.MIN_VALUE;
    public int height1(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height1(root.left);
        int rh=height1(root.right);
        res=Math.max(res,1+lh+rh); // it will diameter
        return 1+Math.max(lh,rh);
    }

}

