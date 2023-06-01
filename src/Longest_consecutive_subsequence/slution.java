package Longest_consecutive_subsequence;

import java.util.Arrays;
import java.util.HashSet;

public class slution {

    static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        HashSet<Integer>set=new HashSet<>();
        int cur=1;
        int res=1;
        for(int i=0;i<N;i++)
        {
            set.add(arr[i]);
        }
        for(int i=0;i<set.size();i++)
        {
            if(!set.contains(arr[i]-1))
            {
                while(set.contains(arr[i]+cur))
                {
                    cur++;

                }

                res=Math.max(res,cur);
            }

            cur=1;
        }
        return res;

    }
    // navie
    static int findLongestConseqSubseq1(int arr[], int N)
    {
        // add your code here
        int cur=1;
        int res=1;
        Arrays.sort(arr);
        for(int i=1;i<N;i++)
        {
            if(arr[i]==arr[i-1]+1)
            {
                cur++;
            }
            else
            {
                res=Math.max(res,cur);
                cur=1;
            }
        }
        return res;
    }
}
