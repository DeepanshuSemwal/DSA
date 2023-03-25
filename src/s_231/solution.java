package s_231;

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

    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca=lca(root,a,b);
        int d1=dist(lca,a,0);
        int d2=dist(lca,b,0);
        return d1+d2;



    }

    public Node lca(Node root, int a, int b) {
        if (root == null) {
            return null;
        }
        if (root.data == a || root.data == b) {
            return root;
        }
        Node left=lca(root.left,a,b);
        Node right=lca(root.right,a,b);
        if (left == null) {
            return right;
        }
      else  if (right == null) {
           return left;
        }

        else
        {
            return root;
        }

    }

    public int dist(Node root, int k, int dist) {
        if (root == null) {
            return -1;
        }
        if (root.data == k) {
            return dist;
        }
        int left = dist(root.left, k, dist + 1);
        int right = dist(root.right, k, dist + 1);
        if (left != -1) {
            return left; // we can find k vala node in left subtree
        }
        else
        {
            return right;  // we are not able to k vala node in left subtree so we are checking in left subtree
        }


    }
}