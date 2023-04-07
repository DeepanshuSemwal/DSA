package s_251;

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

    // exactly similar to construct a binary tree from preorder traversal
    // watch on leetcode 1008
    public static Node post_order(int pre[], int size)
    {
        //Your code here
        int i[]=new int[1];
        return helper(pre,Integer.MAX_VALUE,i);

    }

    public static Node helper(int arr[],int bound,int i[])
    {
        if(i[0]==arr.length || arr[i[0]]>bound)
        {
            return null;
        }
        Node root=new Node(arr[i[0]++]);
        root.left=helper(arr,root.data,i);
        root.right=helper(arr,bound,i);
        return root;
    }
}
