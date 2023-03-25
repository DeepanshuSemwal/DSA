package s_233;


class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
public class solution {
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        int[] k1=new int[1];
        k1[0]=k;

        Node ans=helper(root,k1,node);
        if(ans==null || ans.data==node)
        {
            return -1;
        }
        else
        {
            return ans.data;
        }

    }

    public Node helper(Node root,int k[],int node)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data==node)
        {
            return root; // find the node
        }
        Node leftAns=helper(root.left,k,node);
        Node rightAns=helper(root.right,k,node);
        if(leftAns!=null && rightAns==null)
        {
            k[0]--;
            if(k[0]<=0)
            {
                k[0]=Integer.MAX_VALUE;  // we use it to lock the answer
                return root;
            }
            return leftAns;
        }
        if(leftAns==null && rightAns!=null)
        {
            k[0]--;
            if(k[0]<=0)
            {
                k[0]=Integer.MAX_VALUE;
                return root;
            }
            return rightAns;
        }
        return null;

    }

    }



