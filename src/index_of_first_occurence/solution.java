package index_of_first_occurence;

public class solution {


    public static int firstOccurence(int arr[],int n,int x)
    {
        // navie approach
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    public static int firstOccurence2(int arr[],int n,int x)
    {
        // effcient
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(arr[mid]>x)
            {
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else // arr[mid]==x
            {
                if(mid==0 || arr[mid]!=arr[mid-1]) // mid==0 means all the elements are same [5,,5,5]
                {
                    return mid;
                }
                else
                {
                    high=low-1;
                }
            }
        }
        return -1;
    }
}
