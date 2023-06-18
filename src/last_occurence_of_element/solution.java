package last_occurence_of_element;

public class solution {

    /// navie
    public static int lastOccurence(int arr[],int n,int x)
    {
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurence2(int arr[],int n,int x)
    {
       // binary search since array is sorted
        int low=0;
        int high=n-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<x)
            {
                low=mid+1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                if(arr[mid]!=arr[mid+1] || mid==n-1) // n-1 means all the e;lements are same [5,5,5]
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
}
