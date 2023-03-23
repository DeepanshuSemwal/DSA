package s_216;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }

public class solution {
    public void toSumTree(Node root){
        //add code here.
        helper(root);

    }
    public int helper(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        int temp=root.data;
        root.data=left+right;
        return left+right+temp;

    }
}
}
