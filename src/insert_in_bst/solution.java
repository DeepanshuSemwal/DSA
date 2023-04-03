package insert_in_bst;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode() {
     }

     TreeNode(int val) {
         this.val = val;
     }

     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
public class solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root==null)
        {
             root=new TreeNode(val);
             root.left=null;
             root.right=null;
             return root;

        }
        if(root.val>val)
        {
           root.left= insertIntoBST(root.left,val);
        }
        else
        {
            root.right=insertIntoBST(root.right,val);
        }
        return root;

    }

}

