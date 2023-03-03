package s_85;

import java.util.Arrays;

public class solution {
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        // code here

        int i=n-1;

        int j=0;

        while(i>=0 && j<m)

        {

            if(arr2[j]<arr1[i])

            {

                long temp = arr2[j];

                arr2[j] = arr1[i];

                arr1[i] = temp;

            }

            i--;

            j++;

        }

        Arrays.sort(arr1);

        Arrays.sort(arr2);

    }
}
