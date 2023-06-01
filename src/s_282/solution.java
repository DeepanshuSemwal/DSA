package s_282;

import java.util.Arrays;
import java.util.HashSet;

public class solution {

    // using sorting
    static int missingNumber1(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int res=1;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==res)
            {
                res++;
            }
        }
        return res;

    }

    // using hashSet
    HashSet<Integer>set=new HashSet<>();
    static int missingNumber2(int arr[], int size)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                set.add(arr[i]);
            }
        }
        for(int i=0;i<size;i++)
        {
            if(!set.contains(i+1))
            {
                return i+1;
            }
        }
        return size+1; // 1 to n positive elements are present then we know we need to return next element that is n+1
    }

    static int missingNumber(int arr[], int size)
    {
        for(int i=0;i<size;i++)
        {
            int cur_index=arr[i]-1;
            while(arr[i]>0 && arr[i]<=size && arr[i]!=cur_index)
            {
                int temp=arr[i];
                arr[i]=arr[cur_index];
                arr[cur_index]=temp;
                cur_index=arr[i]-1;
            }
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i]!=i+1)
            {
                return i+1;
            }
        }
        return size+1;
    }

}
