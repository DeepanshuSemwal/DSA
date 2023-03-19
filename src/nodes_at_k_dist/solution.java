package nodes_at_k_dist;

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

    public void kNodeDist(Node root,int k)
    {
        if(root==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.println(root.key);
        }
        else
        {
            kNodeDist(root.left,k-1);
            kNodeDist(root.right,k-1);
        }
    }

}
