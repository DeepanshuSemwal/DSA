package revision2;

import com.sun.source.tree.Tree;

import javax.swing.text.SimpleAttributeSet;
import java.util.*;

class Node
{
    Node left;
    Node right;
    int data;
    Node(int d)
    {
        data=d;
    }
}
public class soltuion {

    public int maxPath(Node root)
    {
        int maxVal[]=new int[1];
        maxVal[0]=Integer.MIN_VALUE;
        helper(root,maxVal);
        return maxVal[0];
    }
    public int helper(Node root, int maxval[]) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, helper(root.left, maxval));
        int right = Math.max(0, helper(root.right, maxval));
        maxval[0]=Math.max(maxval[0],root.data+left+right);
        return root.data+Math.max(left,right);

    }
}
