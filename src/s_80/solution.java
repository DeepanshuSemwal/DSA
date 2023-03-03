package s_80;

public class solution {
    public static int ceilingInSortedArray1(int n, int x, int[] arr) {
        // Write your code here.
        // linear search
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=x)
            {
                res=Math.min(res,arr[i]);
            }
        }
        if(res==Integer.MAX_VALUE)
        {
            return -1;
        }
        return res;


    }

    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.

        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                res=arr[mid];
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[]={1 ,2, 3, 4, 5, 6};
        System.out.println(ceilingInSortedArray1(6,5,arr));

    }
}
