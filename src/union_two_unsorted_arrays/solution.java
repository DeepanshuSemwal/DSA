package union_two_unsorted_arrays;

import java.util.HashSet;

public class solution {

    public static int union(int a[],int b[])
    {
        int m=a.length;
        int n=b.length;
        int res=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            set.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            set.add(b[i]);
        }
        return set.size();
    }
}
