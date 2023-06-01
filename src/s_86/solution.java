package s_86;

import java.util.Arrays;

public class solution {
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int high=(int)N;
        return countInverion(arr,0,high-1);


    }
    static long countAndMerge(long arr[],int low,int high,int mid)
    {
        int i=0;
        int j=0;
        int k=0;
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int l=0;l<n1;l++)
        {
            left[low+i]=(int)arr[i];
        }
        for(int r=0;r<n2;r++)
        {
            right[mid+1+i]=(int)arr[i];
        }
        int res=0;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i++;
                k++;
            }
            else {
                arr[k] = right[j];
                res += (n1 - i);
                j++;
                k++;
            }

        }
        while(i<n1)
        {
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=right[j];
            j++;
            k++;
        }
        return (long) res;
    }


    static int countInverion(long arr[],int low,int high)
    {
        int res=0;
        int mid=(high+low)/2;
        if(low<high)
        {
            res+=countInverion(arr,low,mid);
            res+=countInverion(arr,mid+1,high);
            res+=countAndMerge(arr,low,high,mid);

        }
        return res;
    }
}
