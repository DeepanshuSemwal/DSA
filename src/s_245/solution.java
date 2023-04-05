package s_245;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
public class solution {

    Node binaryTreeToBST(Node root)
    {
        // Your code here
        ArrayList<Integer>al=new ArrayList<>();
        inorder(root,al);
        Collections.sort(al);
        return buildTree(al,0,al.size()-1);

    }
    void inorder(Node root,ArrayList<Integer>al)
    {
        if(root==null)
        {
            return;
        }

        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
    }

    Node buildTree(ArrayList<Integer>al,int min,int max)
    {
        if(min>max)
        {
            return null;
        }
        int mid=(min+max)/2;
        Node temp=new Node(al.get(mid));
        temp.left=buildTree(al,min,mid-1);
        temp.right=buildTree(al,mid+1,max);
        return temp;
    }

}
}
