package s_228;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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

   // gfg

    boolean duplicate=false;
    int dupSub(Node root) {
        // code here

        String s="";
        HashSet<String>set=new HashSet<>();
        helper(root,s,set);
        if(duplicate==true)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    String helper(Node root,String s,HashSet<String>set)
    {
        if(root==null)
        {
            return "$";
        }
        s=String.valueOf(root.data);
        String l=helper(root.left,s,set);
        String r=helper(root.right,s,set);
        if(l!="$"||r!="$")
        {
            if(set.contains(l+r+s))
            {
                duplicate=true;
            }
            else
            {
                set.add(l+r+s);
            }
        }
        return l+r+s;


    }


    }

