package s_255;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node
{
    Node left;
    Node right;
    int data;
    Node(int d)
    {
        data =d;
    }
}
public class solution {


    // most efficent appraoch is using linkdlist space : O(max(h1,h2))

    // iam using stack space : O(h1+h2)

    public List<Integer> merge(Node root1, Node root2)
    {
        // Write your code here

        ArrayList<Integer>al=new ArrayList<>();
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        while (root1!=null || root2!=null || !s1.isEmpty() || !s2.isEmpty())
        {
            while (root1!=null)
            {
                s1.add(root1);
                root1=root1.left;
            }
            while (root2!=null)
            {
                s2.add(root2);
                root2=root2.left;
            }
            if((s2.isEmpty()) || (!s1.isEmpty() && s1.peek().data<s2.peek().data))
            {
                root1=s1.pop();
                al.add(root1.data);
                root1= root1.right;
            }
            else
            {
                root2=s2.pop();
                al.add(root2.data);
                root2=root2.right;
            }
        }
        return al;



    }





}