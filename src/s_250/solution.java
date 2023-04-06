package s_250;


import java.util.ArrayList;

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

    public static Node flatten(Node root)
    {
        //code here
        Node dummy=new Node(-1);
        Node prev=dummy;
        inorder(root,prev);
        // making both left and right null because for last node both left and right child node will be null
        prev.left=null;
        prev.right=null;
        Node temp=dummy.right;
        return temp;
        // return new root

    }
    public static void inorder(Node root,Node prev)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,prev);
        prev.left=null;
        prev.right=root;
        inorder(root.right,prev);

    }
}
