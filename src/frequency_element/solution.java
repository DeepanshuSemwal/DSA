package frequency_element;

import java.util.*;

public class solution {

    public static void freq(int arr[],int n)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
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
        for(Map.Entry mapEntry: map.entrySet())
        {
            System.out.println(mapEntry.getKey()+ " "+mapEntry.getValue());
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer>al=new ArrayList<>();
        int n1=nums1.length;
        int n2= nums2.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n2;i++)
        {
            set.add(nums2[i]);
        }
        int index=0;
        for(int i=0;i<n1;i++)
        {
            if(set.contains(nums1[i]))
            {
                al.add(nums1[i]);
                set.remove(nums1[i]);
            }
        }
        int res[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            res[i]=al.get(i);
        }

        return res;
    }
}
