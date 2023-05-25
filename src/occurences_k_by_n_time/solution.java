package occurences_k_by_n_time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution {

    // navie approach
    public static int occurence(int arr[],int n,int k)
    {
        int cur=1;
        int res=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    cur++;
                }
            }
            if(cur>n/k)
            {
                res++;
            }
            cur=1;
        }
        return res;

    }
    // sorting
    public static int occurence2(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        int cur=1;
        int res=0;
       for(int i=1;i<n;i++)
       {
           while(arr[i-1]==arr[i])
           {
               cur++;
           }
           if(cur>n/k)
           {
               res++;
           }
       }
       return res;
    }

    // efficient approach
    public static int occurence3(int arr[],int n,int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        int res=0;
        for(Map.Entry<Integer,Integer>mapEntry:map.entrySet())
        {
            if(mapEntry.getValue()>n/k)
            {
                res++;
            }
        }
        return res;
    }

}
