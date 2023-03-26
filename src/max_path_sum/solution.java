package max_path_sum;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class solution {

    public int maxPathSum(TreeNode root) {

        int maxVal[]=new int[1];
        maxVal[0]=Integer.MIN_VALUE;
        helper(root,maxVal);
        return maxVal[0];
    }

    public int helper(TreeNode root,int[]maxVal)
    {
        if(root==null)
        {
            return 0;
        }
        int leftMax=Math.max(0,helper(root.left,maxVal));
        int rightMax=Math.max(0,helper(root.right,maxVal));
        maxVal[0]=Math.max(maxVal[0],leftMax+rightMax+root.val); //  it used to store the maximum result
        return Math.max(leftMax,rightMax)+root.val; // // ye left +right+root vali value return karega
    }

}
