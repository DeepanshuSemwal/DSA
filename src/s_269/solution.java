package s_269;

import java.util.HashMap;
import java.util.Map;

public class solution {

    int maxRepeating(int[] arr, int n, int k) {
        // code here

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
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer>mapEntry:map.entrySet())
        {
            max=Math.max(max,mapEntry.getValue()); // getting maxmimum repeating elemnets
        }
        for(Map.Entry<Integer,Integer> mapEntry: map.entrySet())
        {
            if(max==mapEntry.getValue()) // if two values repeating same time then we have to return choti number vali value
            {
                min=Math.min(min,mapEntry.getKey());
            }
        }
        return min;
    }
}
