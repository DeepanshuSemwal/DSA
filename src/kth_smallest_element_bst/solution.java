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
    public Node Kth_smallest(Node root,int k)
    {
        // effcient
       if(root==null)
       {
           return null;
       }
       int count=root.left.count+1;
       if(count==k)
       {
           return root;
       }
       if(count>k)
       {
           return Kth_smallest(root.left,k);
       }
       return Kth_smallest(root.right,k);


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
