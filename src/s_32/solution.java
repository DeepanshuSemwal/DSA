package s_32;

public class solution {

    public static int overlap(int arr[],int n)
    {
        int res=0;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            if(arr[low]==arr[high])
            {
                low++;
                high--;
            }
            else if(arr[low]<arr[high])
            {
                res++;
                low++;
                arr[low]+=arr[low-1];
            }
            else if(arr[high]<arr[low])
            {
                res++;
                high--;
                arr[high]+=arr[high-1];
            }
        }
        return res;

    }
}
