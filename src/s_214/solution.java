package s_214;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class solution {

    int maxLevel=-1;
    boolean ans=true;
    boolean check(Node root)
    {
        // Your code here
        helper(root,0);
        return ans;
    }
    void helper(Node root,int level)
    {
        // To save further iteration when ans is flaged false
        if(root == null || !ans) return;

        // Check if the current node is leaf node or not
        if(root.left == null && root.right == null){

            // if leaf is it the first time when reaching a leaf node the store that level
            if(maxLevel == -1) maxLevel = level;

                // check if the leaf node is not equal to the maxLevel
            else if(maxLevel != level) ans = false;
        }


        helper(root.left, level +1);
        helper(root.right, level +1);
    }

}
