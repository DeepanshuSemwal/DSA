package s_251;

class TreeNode
{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int d)
    {
        val =d;
    }
}
public class solution {

    // exactly similar to construct a binary tree from preorder traversal
    // watch on leetcode 1008
    public static TreeNode post_order(int pre[], int size)
    {
        //Your code here
        int i[]=new int[1];
        return helper(pre,Integer.MAX_VALUE,i);

    }

    public static TreeNode helper(int arr[], int bound, int i[])
    {
        if(i[0]==arr.length || arr[i[0]]>bound)
        {
            return null;
        }
        TreeNode root=new TreeNode(arr[i[0]++]);
        root.left=helper(arr,root.val,i);
        root.right=helper(arr,bound,i);
        return root;
    }
}
