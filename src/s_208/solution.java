package s_208;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

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


 public TreeNode invertTree(TreeNode root) {

  if(root!=null)
  {
      invertTree(root.left);
      invertTree(root.right);
      TreeNode temp=root.left;
      root.left=root.right;
      root.right=temp;
  }
  return root;


 }
}
