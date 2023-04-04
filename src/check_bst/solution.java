package check_bst;

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

    public boolean isBST(Node root,int min,int max)
    {
      if(root==null)
      {
          return true;
      }
      return (root.data>min && root.data<max && isBST(root.left,min,root.data) && isBST(root.right,root.data,max));
    }

}
