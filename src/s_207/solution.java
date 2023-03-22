package s_207;

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

     static boolean ans=false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null)
        {
            return false;
        }

        if(preorder(root,subRoot))
        {
            return true;
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    // preorder or dfs

    public boolean preorder(TreeNode root,TreeNode subRoot)
    {
        if(root==null && subRoot==null)
        {
            return true;
        }
        if(root==null || subRoot==null)
        {
            return false;
        }
        if(root.val!= subRoot.val)
        {
            return false;
        }
        return preorder(root.left,subRoot.left) && preorder(root.right,subRoot.right);
    }



}
