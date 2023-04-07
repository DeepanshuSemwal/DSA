package s_254;

import java.rmi.dgc.VMID;
import java.util.ArrayList;

class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class solution {

    Node buildBalancedTree(Node root)
    {
        //Add your code here.
        ArrayList<Integer>al=new ArrayList<>();
       helper(root,al);
      return buildTree(al,0,al.size()-1);



    }
    public void helper(Node root, ArrayList<Integer>al)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,al);
        al.add(root.data);
        helper(root.right,al);
    }
    public Node buildTree(ArrayList<Integer>al, int min, int max)
    {
        if(min>max)
        {
            return null;
        }
        int mid=(min+max)/2;
        Node root=new Node(al.get(mid));
        root.left=buildTree(al,min,mid-1);
        root.right=buildTree(al,mid+1,max);
        return root;

    }

}
