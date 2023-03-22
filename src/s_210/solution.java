package s_210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    Node left;
    Node right;
    int item;
    Node(int k)
    {
        item=k;
    }
}
public class solution {

    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        ArrayList<Integer>al=new ArrayList<>();
        if(root==null)
        {
           return al;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {

            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                Node cur= queue.poll();
                if(i==0)
                {
                    al.add(cur.item);
                }
                if(cur.left!=null)
                    {
                        queue.add(cur.left);
            }
                if(cur.right!=null)
                {
                    queue.add(cur.right);
                }
            }
        }
        return al;

    }
}
