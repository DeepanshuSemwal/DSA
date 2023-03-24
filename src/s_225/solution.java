package s_225;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    boolean isLeaf(Node node)
    {
        if(node.left == null && node.right == null) return true;

        return false;
    }
    ArrayList<Integer> boundary(Node node)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        if(isLeaf(node) == false) ans.add(node.data);
        addleft(node, ans);
        addleaf(node, ans);
        addright(node, ans);
        return ans;
    }
    void addleft(Node node, ArrayList<Integer>a)
    {
        Node cur = node.left;
        while(cur != null){
            if(isLeaf(cur) == false) a.add(cur.data);
            if(cur.left != null)
                cur = cur.left;
            else
                cur = cur.right;
        }
    }
    void addright(Node node, ArrayList<Integer>a)
    {
        Node cur = node.right;
        ArrayList<Integer>temp = new ArrayList<>();
        while(cur != null){
            if(isLeaf(cur) == false) temp.add(cur.data);
            if(cur.right != null)
                cur = cur.right;
            else
                cur = cur.left;
        }
        for(int i=temp.size()-1; i>=0; i--){
            a.add(temp.get(i));
        }
    }
    void addleaf(Node node, ArrayList<Integer>a) //for adding leaves, follow pre, post or in order traversal
    {
        if(isLeaf(node)){
            a.add(node.data);
            return;
        }
        if(node.left != null) addleaf(node.left, a);
        if(node.right != null) addleaf(node.right, a);
    }

}


