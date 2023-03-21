package burn_leaf_bt;

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
public class soluton {

    static class Depth
    {
        int d;
        Depth(int d)
        {
            this.d=d;
        }
    }

    public static int minTime(Node root,int target)
    {
        Depth depth=new Depth(-1);
        burn(root,target,depth);
        return ans;
    }
    public static int ans=-1;
    public static int burn(Node root,int target,Depth depth)
    {
        if(root==null)
        {
            return 0;
        }
        Depth ld=new Depth(-1);
        Depth rd=new Depth(-1);
        int lh=burn(root.left,target,ld);
        int rh=burn(root.right,target,rd);
        if(ld.d!=-1)
        {
            ans= Math.max(ans,ld.d+rh+1);
            depth.d=ld.d+1;
        }
        else if(rd.d!=-1)
        {
            ans= Math.max(ans,ld.d+1+lh);
            depth.d=rd.d+1;
        }

        return Math.max(lh,rh)+1;

    }
}
