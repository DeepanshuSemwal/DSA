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

}
