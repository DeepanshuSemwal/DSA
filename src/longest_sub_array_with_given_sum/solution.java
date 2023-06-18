package longest_sub_array_with_given_sum;

import java.util.Arrays;
import java.util.HashMap;

public class solution {

    // if 0 and positive are given then use sliding window
    public static int fun(int arr[],int n,int sum)
    {
        int i=0;
        int j=0;
        int res=0;
        int cur_sum=0;
        while(i<n)
        {
            cur_sum+=arr[i];
            while(cur_sum>sum)
            {
                cur_sum-=arr[j];
                j++;
            }
            if(cur_sum==sum)
            {
                res=Math.max(res,i-j+1);
            }
            i++;
        }
        return res;
    }

    // navie approach
    public static int fun2(int arr[],int n,int sum)
    {
        int res=0;
        int cur_sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                cur_sum+=arr[j];
                if(cur_sum==sum)
                {
                    res=Math.max(res,j-i+1);
                }
            }

        }
        return res;
    }

    // best
    public static int fun3(int arr[],int n,int sum)
    {
       int res=0;
       int cur_sum=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++)
       {
           cur_sum+=arr[i];
           // this if condition is used to handle the case if our answer will begin from 0 index
           if(cur_sum==sum)
           {
               res=i+1;
           }
           if(!map.containsKey(cur_sum))
           {
               map.put(cur_sum,i);
           }
           if(map.containsKey(cur_sum-sum))
           {
               res=Math.max(res,i-map.get(cur_sum-sum));
           }


       }
       return res;

    }
    public static int fun(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
          if(arr[i]==0)
          {
              arr[i]=-1;
          }
        }
        // [1,-1,1,1,1,-1,-1]
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int cur_sum=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            cur_sum+=arr[i];
            if(cur_sum==sum)
            {
                res=i+1;
            }
            if(!map.containsKey(cur_sum))
            {
                map.put(cur_sum,i);
            }
            if(map.containsKey(cur_sum-sum))
            {
                res=Math.max(res,i-map.get(cur_sum-sum));
            }

        }
        return res;
    }







}
