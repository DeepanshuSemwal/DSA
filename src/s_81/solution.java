package s_81;

import java.util.Arrays;

public class solution {
    public static boolean givenPairDifference(int arr[],int n,int target)
    {
        // navaie approach use hashmap
        // efficient two pointer
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<arr.length && j<arr.length)
        {
            if(i!=j && arr[j]-arr[i]==target)
            {
                return true;
            }
            else if(arr[j]-arr[i]>target)
            {
                i++;
            }
            else if(arr[j]-arr[i]<target)
            {
                j++;
            }
        }
        return false;
    }
}
