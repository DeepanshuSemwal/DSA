package level_order_traversal;

import java.util.LinkedList;
import java.util.Queue;

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

    public void levelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node cur= queue.poll();
            System.out.print(cur.key);
            if(cur.left!=null)
            {
                queue.add(cur.left);
            }
            if(cur.right!=null)
            {
                queue.add(cur.right);
            }
        }
    }
    // line by line

    public void levelOrder2(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int count=queue.size();
          for(int i=0;i<count;i++)
          {
              Node cur= queue.poll();
              System.out.print(cur.key);
              if(cur.left!=null)
              {
                  queue.add(cur.left);
              }
              if(cur.right!=null)
              {
                  queue.add(cur.right);
              }
          }
            System.out.println();
        }
    }



}
