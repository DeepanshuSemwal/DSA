package s_193;

import java.util.Arrays;

public class solution {

        long maxSum(long arr[] ,int n)
        {

            long sum=0;
            Arrays.sort(arr);
            int i=0;
            int j=n-1;
            while (i<j)
            {
                sum+=Math.abs(arr[i]-arr[j]);
                sum+=Math.abs(arr[i+1]-arr[j]);
                i++;
                j--;
            }
            // since array is circular
            sum+=Math.abs(arr[i]-arr[0]);
            return sum;
        }


}
