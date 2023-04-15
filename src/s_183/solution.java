package s_183;

import java.util.Arrays;

public class solution {

    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        long a=0;
        long b=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                // hold for even elements sum
                a=a*10+arr[i];
            }
            else
            {
                // hold for odd element sums
                b=b*10+arr[i];
            }
        }
        return a+b;
    }
}
