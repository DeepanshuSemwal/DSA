package serialization_deserailation;

import java.util.ArrayList;

class Node
{
    Node left;
    Node right;
    int key;
    Node(int k)
    {
        key=k;
    }
}
public class solution {

    static final int empty=-1;
    // we are using pre order traversal
    public static void serailize(Node root, ArrayList<Integer>arr)
    {
        if(root==null)
        {
            arr.add(empty);
            return;
        }
        arr.add(root.key);
        serailize(root.left,arr);
        serailize(root.right,arr);
    }
    static int index=0;
    public Node derserailze(ArrayList<Integer>al)
    {
        if(index==al.size())
        {
            return null;
        }
        int val=al.get(index);
        index++;
        Node root=new Node(val);
        root.left=derserailze(al);
        root.right=derserailze(al);
        return root;


    }

}
