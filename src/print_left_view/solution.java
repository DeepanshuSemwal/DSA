package print_left_view;

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
    public void leftView(Node root)
    {

        // using iterative :it is similar to level order travesel

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
                Node cur=root;
                if(i==0)
                {
                    System.out.print(cur.key);
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
        }

    }


    public static void main(String[] args) {
        Node root=new Node(30);
        root.left=new Node(50);
        root.right=new Node(60);
        root.right.left=new Node(70);
        root.right.right=new Node(8);
        root.right.left.right=new Node(90);



    }
}
