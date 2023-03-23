package s_222;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class solution {

    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<Pair>queue=new LinkedList<>();
        ArrayList<Integer>al=new ArrayList<>();
        if(root==null)
        {
            return al;
        }
        // we use tree map so that we will get hashmap keys in sorted order that is from left to right
        TreeMap<Integer,Integer>map=new TreeMap<>();
        queue.add(new Pair(0,root));
        while(!queue.isEmpty())
        {
            Pair cur=queue.poll();
            if(!map.containsKey(cur.hd))
            {

                map.put(cur.hd,cur.root.data);
            }
            if(cur.root.left!=null)
            {
                queue.add(new Pair(cur.hd-1,cur.root.left));
            }
            if(cur.root.right!=null)
            {
                queue.add(new Pair(cur.hd+1,cur.root.right));
            }


        }
        // itertate over map

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
