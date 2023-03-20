package max_width_bt;

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

    // level order traversal line by line

    public static int maxWidth(Node root)
    {
        int res=0;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int count=queue.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++)
            {
                Node cur= queue.poll();
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
        return res;
    }
}
