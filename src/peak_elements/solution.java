package peak_elements;

import java.util.ArrayList;

public class solution {

    // my code navie approach
    public static ArrayList<Integer> peakElement(int arr[], int n)
    {
        // handling edge case
        ArrayList<Integer>res=new ArrayList<>();
        if(n==1)
        {
            res.add(arr[0]);
        }
        if(arr[0]>=arr[1])
        {
            res.add(arr[0]);
        }
        if(arr[n-1]>=arr[n-2])
        {
            res.add(arr[n-1]);
        }
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                 res.add(arr[i]);
            }
        }
        return res;
    }

    // efficient approch
    // aditya verma
    public static int peakElement2(int arr[],int n)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2; // to save integer overflow
            if(mid>0 && mid<n-1)
            {
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                {
                    return arr[mid];
                }
                else if(arr[mid]<arr[mid-1])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid+1;
                }
            }
            else if(mid==0) // handling corner cases
            {
                if(arr[mid]>arr[mid+1])
                {
                    return arr[mid];
                }
                else
                {
                    return arr[1];
                }
            }
            else if(mid==n-1)
            {
                if(arr[mid]>arr[mid-1])
                {
                    return arr[mid];
                }
                else
                {
                    return arr[n-2];
                }
            }


        }
        return -1;
    }
}
