package swap_nodes_BST;

import java.util.HashMap;

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
public class solution {

    // try this problem in gfg and leetcode
    Node prev=null;
    Node first=null;
    Node second=null;

    public void ans(Node root)
    {
        fixBST(root); // after finding the 2 nodes we swap their data
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
    }
    // this function will find the nodes
    public void fixBST(Node root)
    {
        // we follow inorder traversal
        if(root==null)
        {
            return;
        }
        fixBST(root.left);
        if(prev!=null && root.data< prev.data)
        {
            if(first==null)
            {
                first=prev;
            }
            second=root;
        }
        prev=root;
        fixBST(root.right);

    }

}
