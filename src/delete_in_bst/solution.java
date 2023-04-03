package delete_in_bst;

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

    public TreeNode deleteNode(TreeNode root, int key) {

        if(root==null)
        {
            return null;
        }
        if(root.val>key)
        {
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key)
        {
            root.right= deleteNode(root.right,key);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else
            {
                TreeNode sucessor=getSucc(root);
                root.val=sucessor.val;
                root.right=deleteNode(root.right,sucessor.val);
            }
        }
        return root;
    }

   public static TreeNode getSucc(TreeNode root)
   {
       TreeNode cur=root.right;
       while(cur!=null && cur.left!=null)
       {
           cur=cur.left;
       }
       return cur;
   }

}
