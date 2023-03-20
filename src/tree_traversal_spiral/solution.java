package tree_traversal_spiral;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    public void spiralform(Node root)
    {
        Queue<Node>queue=new LinkedList<>();
        Stack<Integer>stack=new Stack<>();
        boolean reverse=false;
        queue.add(root);
        while (!queue.isEmpty())
        {
            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                Node cur=queue.poll();
                if(reverse)
                {
                    stack.add(cur.key);

                }
                else
                {
                    System.out.print(cur.key+" ");
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
            if(reverse)
            {
                while (!stack.isEmpty())
                {
                    System.out.print(stack.pop()+" ");
                }
            }

            reverse=!reverse;

        }
    }

    // efficient using two stacks

    public void spiralTree(Node root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node>s1=new Stack<>();
        Stack<Node>s2=new Stack<>();
        s1.add(root);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                Node cur=s1.peek();
                s1.pop();
                System.out.println(cur.key+" ");
                // add elemenet from right to left
                if(cur.right!=null)
                {
                    s2.add(cur.left);
                }
                if(cur.left!=null)
                {
                    s2.add(cur.right);
                }
            }
            while (!s2.isEmpty())
            {
                Node cur=s2.peek();
                s2.pop();
                System.out.println(cur.key+" ");
                // add element from left to right
                if(cur.left!=null)
                {
                    s1.add(cur.left);
                }
                if(cur.right!=null)
                {
                    s2.add(cur.left);
                }
            }
        }
    }

}
