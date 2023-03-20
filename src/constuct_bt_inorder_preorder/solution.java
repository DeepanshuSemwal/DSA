package constuct_bt_inorder_preorder;

import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.util.HashMap;

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
     int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int is=0;
        int ie=inorder.length-1;
     //   return helper(preorder,inorder,is,ie);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return helper2(preorder,inorder,is,ie,map);



    }

    // this code will take o(n square) time but we can impove it by using HashMap put inorder in HashMap
    public TreeNode helper(int []preorder,int[] inorder,int is,int ie)
    {
        if(is>ie)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[preindex++]);
        int inIndex=0;
        for(int i=is;i<=ie;i++)
        {
            if(inorder[i]==root.val)
            {
                inIndex=i;
                break;
            }
        }
        root.left=helper(preorder,inorder,is,inIndex-1);
        root.right=helper(preorder,inorder,inIndex+1,ie);
        return root;


    }

    // efficient
        // time :o(n)

    public TreeNode helper2(int[]preorder, int[]inorder, int is, int ie, HashMap<Integer,Integer>map)
    {
        if(is>ie)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[preindex++]);
        int inIndex=map.get(root.val);
        root.left=helper2(preorder,inorder,is,inIndex-1,map);
        root.right=helper2(preorder,inorder,inIndex+1,ie,map);
        return root;
    }


}
