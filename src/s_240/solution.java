package s_240;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null)
        {
            return null;
        }
        TreeNode cur=root;
        if(cur.val<p.val && cur.val<q.val)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        else if(cur.val>p.val && cur.val>q.val)
        {
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;

    }

}
