package kth_smallest_element_bst;

public class solution {

    class Node
    {
        Node left;
        Node right;
        int data;
        int count=0;
        Node(int d)
        {
            data=d;
        }
    }

    // for effcient solution we have to make change in structure of Node we have to add a leftcount
    // navie solution is important

    public Node insert(Node root,int k)
    {
        if(root==null)
        {
            return new Node(k);
        }
        if(root.data>k)
        {
            root.left.count++;
            root.left= insert(root.left,k);
        }
        else if(root.data<k)
        {
            root.right= insert(root.right,k);
        }
        return root;
    }


    // navie

    static int count=0;
    public void kth_smallest(Node root,int k)
    {

      if(root==null)
      {
          return;
      }
      kth_smallest(root.left,k);
      count++;
      if(count==k)
      {
          System.out.println(root.data);
      }
      kth_smallest(root.right,k);
    }


}


// efficent

//class Solution {
//    int count=0;
//    int res=0;
//    public int kthSmallest(TreeNode root, int k) {
//
//        helper(root,k);
//        return res;
//
//    }
//    public void helper(TreeNode root,int k)
//    {
//        if(root==null)
//        {
//            return;
//        }
//        helper(root.left,k);
//        count++;
//        if(count==k)
//        {
//            res=root.val;
//        }
//        helper(root.right,k);
//
//    }
