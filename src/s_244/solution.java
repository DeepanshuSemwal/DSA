package s_244;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class solution {


    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        int min=1;
        int max=Integer.MAX_VALUE;
        return helper(root,min,max);

    }
    public static boolean helper(Node root,int min,int max)
    {
        if(root==null)
        {
            return false;
        }
        if(min==max)
        {
            return true;
        }
        return helper(root.left,min,root.data-1) || helper(root.right,root.data+1,max);
    }
}
