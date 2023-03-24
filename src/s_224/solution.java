package s_224;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
public class solution {

    public ArrayList<Integer> diagonal(Node root)
    {
        //add your code here.

        ArrayList<Integer>al=new ArrayList<>();
        if(root==null)
        {
            return al;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node cur=queue.poll();
            while (cur!=null)
            {
                if(cur.left!=null)
                {
                    queue.add(cur.left);
                }
                al.add(cur.data);
                cur=cur.right;
            }
        }
        return al;
    }
}
}
