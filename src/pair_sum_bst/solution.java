package pair_sum_bst;

import java.util.HashSet;

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
HashSet<Integer>set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k)
    {
        if(root==null)
        {
            return false;
        }
        if(findTarget(root.left,k))
        {
            return true;
        }
        if(set.contains(k-root.val))
        {
            return true;
        }
        else
        {
            set.add(root.val);
        }
        return findTarget(root.right,k);
    }

}
