package s_212;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
public class solution {

    ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        ArrayList<Integer>al=new ArrayList<>();
        Stack<Node>s1=new Stack<>();
        Stack<Node>s2=new Stack<>();
        s1.add(root);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while (!s1.isEmpty())
            {
                Node cur=s1.pop();
                al.add(cur.data);
                if(cur.left!=null)
                {
                    s2.add(cur.left);
                }
                if(cur.right!=null)
                {
                    s2.add(cur.right);
                }
            }
            while (!s2.isEmpty())
            {
                Node cur=s2.pop();
                al.add(cur.data);
                if(cur.right!=null)
                {
                    s1.add(cur.right);
                }
                if(cur.left!=null)
                {
                    s1.add(cur.left);
                }
            }
        }
        return al;


    }


}
