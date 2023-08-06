package pratcice;

public class solution {

   static int transitionPoint(int arr[], int n) {
        // code here
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==0)
            {
                // right half
                low=mid+1;
            }
            else // we have one
            {
                // left half
                if((arr[mid]==1 && arr[mid]!=arr[mid-1]) || mid==n-1)
                {
                    return mid;
                }
               high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1};
        int n=arr.length;
        System.out.println(transitionPoint(arr,n));
    }
}
