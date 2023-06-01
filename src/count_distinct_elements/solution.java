package count_distinct_elements;

import javax.management.DescriptorKey;
import java.util.ArrayList;
import java.util.HashMap;

public class solution {

    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else
            {
                map.put(A[i],1);
            }
        }
        al.add(map.size());
        for(int i=k;i<n;i++)
        {
            if(map.get(A[i-k])==1)
            {
                map.remove(A[i-k]);
            }
           else
            {
               map.put(A[i-k],map.get(A[i-k])-1);
            }
           // putting new element in the window
            if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else
            {
                map.put(A[i],1);
            }
            al.add(map.size());
        }
        return al;

    }

}
