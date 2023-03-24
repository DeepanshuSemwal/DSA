package s_227;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Node
{
    Node left;
    Node right;
    int key;
    Node(int k)
    {
        key=k;
    }
}
public class solution {

    public static int minSwaps(int n, int[] A)
    {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        inorder(A,n,0,al);
        int ans=minSwap(al);
        return ans;

    }

    public static void inorder(int A[],int n,int i,ArrayList<Integer>al)
    {
        if(i>=A.length)
        {
            return;
        }
        inorder(A,n,2*i+1,al);
        al.add(A[i]);
        inorder(A,n,2*i+2,al);
    }

    public static int minSwap(ArrayList<Integer>al)
    {
        // Code here
        int nums[]=new int[al.size()];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i]=al.get(i);
        }

        int res=0;


        int [] temp=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++)
        {
            if(temp[i]!=nums[i])
            {
                res++;
                int init=nums[i];
                // we use init to save the element becuase it will change after swaping
                // now do swap
                int temp2=nums[i];
                nums[i]=nums[map.get(temp[i])];
                nums[map.get(temp[i])]=temp2;


                // update the value in the hashmap
                map.put(init,map.get(temp[i]));
                map.put(temp[i],i);


            }
        }
        return res;
    }




}


