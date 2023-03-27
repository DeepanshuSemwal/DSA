package s_232;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}

public class solution {

    HashMap<String,Integer>map=new HashMap<>();
    public List<Node> printAllDups(Node root)
    {
        //code here
        ArrayList<Node>al=new ArrayList<>();
        helper(root,al);
        Collections.sort(al, (node1, node2) -> node1.data-node2.data); // we use this to arrange data in ascending order for gfg
        // for leetcode no need to these kind of stuffs see this problem sloution in leet code i have submitted
        return al;

    }
    public String helper(Node root,ArrayList<Node>al)
    {
        if(root==null)
        {
            return "$";
        }
        String subPath=root.data+","+","+helper(root.left,al)+","+helper(root.right,al);
        if(map.containsKey(subPath))
        {
            map.put(subPath,map.get(subPath)+1);

        }
        else
        {
            map.put(subPath,1);
        }
        if(map.get(subPath)==2)
        {
            al.add(root);
        }
        return subPath;

    }

}
