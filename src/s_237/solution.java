package s_237;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public int sumK(Node root,int k)
    {
        // code here
        ArrayList<Integer>path=new ArrayList<>();
        int count[]=new int[1];
        count[0]=0;
        helper(root,k,count,path);
        return count[0];

    }
    public void helper(Node root,int k,int count[],ArrayList<Integer>path)
    {
        if(root==null)
        {
            return ;
        }
        path.add(root.data);
        // left
        helper(root.left,k,count,path);
        // right
        helper(root.right,k,count,path);
        // check for sum
        int sum=0;
        for(int i=path.size()-1;i>=0;i--)
        {
            sum+=path.get(i);
            if(sum==k)
            {
                count[0]++;
            }
        }
        // remove the last element
        path.remove(path.size()-1);


    }
}


