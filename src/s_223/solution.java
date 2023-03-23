package s_223;

import java.nio.channels.Pipe;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        data=d;
    }
}
public class solution {
    public ArrayList<Integer> bottomView(Node root)
    {
        // Code here
        // simply we are using level order traversal
        ArrayList<Integer>al=new ArrayList<>();
        Queue<Pair>queue=new LinkedList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        if(root==null)
        {
            return null;
        }
        queue.add(new Pair(0,root));
        while (!queue.isEmpty())
        {
            int count=queue.size();
            for (int i=0;i<count;i++)
            {
                Pair cur=queue.poll();
                map.put(cur.hd, cur.root.data);
                if(cur.root.left!=null)
                {
                    queue.add(new Pair(cur.hd-1,cur.root.left));
                }
                if(cur.root.right!=null)
                {
                    queue.add(new Pair(cur.hd+1,cur.root.right));
                }
            }
        }
        // traversing in the map
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            al.add(entry.getValue());
        }
        return al;

    }

    static class Pair
    {
        int hd;
        Node root;
        Pair(int hd,Node root)
        {
            this.hd=hd;
            this.root=root;
        }
    }
}
