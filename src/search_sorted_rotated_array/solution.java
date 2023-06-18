package search_sorted_rotated_array;

public class solution {

    public static int search(int arr[],int n,int x)
    {
        // one half will be sorted and other half is unsorted
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
             if(arr[mid]>=arr[low]) // left half is sorted
            {
                if(x>=arr[low] && x<arr[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1; // ignore the left half
                }
            }
            else //if(arr[mid]<arr[high])
            {
                if(x>arr[mid] && x<=arr[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
