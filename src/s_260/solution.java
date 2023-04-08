package s_260;

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


class NodeValue
{
    int maxNode;
    int minNode;
    int size;
    NodeValue(int maxNode,int minNode,int size)
    {
        this.maxNode=maxNode;
        this.minNode=minNode;
        this.size=size;
    }
}
public class solution {


    public int maxSumBST(TreeNode root) {

        return helper(root).size;

    }

    public NodeValue helper(TreeNode root)
        {
            if(root==null)
            {
                // find a bst with null root
                return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
            }
            // get values from left and right subtrees
            NodeValue left=helper(root.left);
            NodeValue right=helper(root.right);

            // if current node is greater than the largest value of left and smaller than the smallest value of right
            if(left.maxNode<root.val && root.val<right.minNode)

            {
                // it is a bst
                return new NodeValue(Math.min(root.val,left.minNode),Math.max(root.val,right.maxNode), left.size+right.size+1);

            }
            // Otherwise, return [-inf, inf] so that parent can't be valid BST
           // return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.maxNode,right.maxNode));

            return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.size,right.size));

        }
}
