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

    // constraints ka dhiyan rakhna agar bade constraints diye hai toh phir Long.MAX_VALUE and LONG.MIN_VALUE in max and min
    public boolean isBST(Node root,int min,int max)
    {
      if(root==null)
      {
          return true;
      }
      if(root.data<min || root.data>max)
      {
          return false;
      }
      return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);

    }

}
