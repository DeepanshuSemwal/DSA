package s_252;

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


    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root==null)
        {
            return 0;
        }
        if(root.data>=l && root.data<=h)
        {
            // increase count
            return 1+getCount(root.left,l,h)+getCount(root.right,l,h);
        }
        if(root.data<l)
        {
            // element l se small hai so there is no benifit to check its left becuase vaha per saare eleemnt smaller honge
            return getCount(root.right,l,h);
        }
        else
        {
          //  element h se greater hai so there is no benifit to check its right becuase vaha per saare eleemnt greater honge
            return getCount(root.left,l,h);
        }

    }


}
