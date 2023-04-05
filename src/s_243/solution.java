package s_243;

class Res
{
    Node pre=null;
    Node succ=null;

}
class Node
{
    int data;
    Node left, right;

   Node(int d)
   {
       data=d;
   }
}
public class solution {

    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
        // add your code here
        Pre(root,p,key);
        Suc(root,s,key);

    }

    public static void Suc(Node root,Res s,int key)
    {
        while(root!=null)
        {
            if(root.data<=key)
            {
                root=root.right;
            }

            else
            {
                s.succ=root;
                root=root.left;
            }


        }
        return;
    }
    public static void Pre(Node root,Res p,int key)
    {
        while(root!=null)
        {
            if(root.data>=key)
            {
                root=root.left;
            }
            else
            {
                p.pre=root;
                root=root.right;
            }
        }
        return;
    }


}
