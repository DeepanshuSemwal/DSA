package count1_in_sorted_array;

public class solution {
    // my solution
    // binary arraay is given
    public static int count1s(int arr[],int n)
    {
        int x=1;
        int firstOccurence=firstOccurence(arr,n,x);
        int lastOccurnece=LastOccurence(arr,n,x);
        return (lastOccurnece-firstOccurence+1);
    }

    public static int firstOccurence(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                if(arr[mid]!=arr[mid-1] || mid==0)
                {
                    return mid;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static int LastOccurence(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                if(arr[mid]!=arr[mid+1] || mid==n-1)
                {
                    return mid;
                }
                else
                {
                   low=mid+1;
                }
            }
        }
        return -1;
    }

    // efficent use of binary array
    public static int countOnes(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
           int mid=(low+high)/2;
           if(arr[mid]==0)
           {
               low=mid+1;
           }
           else // arr[mid]==1
           {
               // now i only have need to check whether it is its first occurence or not
               if(arr[mid]!=arr[mid-1] || mid==0)
               {
                   return n-mid;
               }
               else
               {
                   // since i nedd to find first first occurence
                   high=mid-1;
               }
           }
        }
        return -1;
    }
}
