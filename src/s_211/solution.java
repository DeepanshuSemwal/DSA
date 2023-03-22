package s_211;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
public class solution {
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer>al=new ArrayList<>();
        if(node==null)
        {
            return al;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                Node cur=queue.poll();
                if(i==count-1)
                {
                    al.add(cur.data);
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
