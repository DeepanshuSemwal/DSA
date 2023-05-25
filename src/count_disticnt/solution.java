package count_disticnt;

import java.util.HashSet;

public class solution {

    public static int countDistinct(int arr[])
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        return set.size();
    }

    // navie
    public static int CountDistinctNavie(int arr[])
    {
        boolean flag=true;
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                res++;
            }

        }
        return res;

    }
}
