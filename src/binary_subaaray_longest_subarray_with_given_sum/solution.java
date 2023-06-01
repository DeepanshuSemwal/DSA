package binary_subaaray_longest_subarray_with_given_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class solution {

    // efficient
    int longestCommonSum(boolean arr1[], boolean arr2[], int n) {
        // code here
       int temp[]=new int[n];
       for(int i=0;i<n;i++)
       {
           int val1=arr1[i]?1:0;
           int val2=arr2[i]?1:0;
           temp[i]=val1-val2;
       }
        HashMap<Integer,Integer>map=new HashMap<>();
       int sum=0;
       int res=0;
       int cur_sum=0;
       for(int i=0;i<n;i++)
       {
           cur_sum+=temp[i];
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
