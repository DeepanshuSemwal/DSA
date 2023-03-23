package s_214;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class solution {

    int ans=1;
    boolean check(Node root)
    {
        // Your code here

        // this code giving wrong answer
        int ma=-1;
        int h=0;
        helper(root,h,ma);
        if(ans==1)
        {
            return true;
        }
        else
        {
            return false;
        }


    }
    public void helper(Node root,int h,int ma)
    {
        if(root==null)
        {
            return;
        }
        if(ans==0)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            if(ma==-1)
            {
                ma=h;
            }
            else
            {
                if(h!=ma)
                {
                    ans=0;
                }
            }
            return;
        }
        helper(root.left,h+1,ma);
        helper(root.right,h+1,ma);
    }

}
