package s_206;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class solution {

    public ArrayList<Integer> reverseLevelOrder(Node node)
    {
        // code here
        if(node==null)
        {
            return null;
        }

        ArrayList<Integer>al=new ArrayList<>();
        Queue<Node>queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty())
        {
            Node cur=queue.poll();
            al.add(cur.data);
            if(cur.right!=null)
            {
                queue.add(cur.right);
            }
            if(cur.left!=null)
            {
                queue.add(cur.left);
            }

        }
        Collections.reverse(al);
        return al;




    }
}
