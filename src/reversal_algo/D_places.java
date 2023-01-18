package reversal_algo;

public class D_places {

    //left rotation
//    public static void onePlaces(int arr[],int n,int d)
//    {
//        int temp=arr[0];
//        for(int i=1;i<n;i++)
//        {
//            arr[i-1]=arr[i];
//        }
//        arr[n-1]=temp;
//        // by one place rotation completed
//
//    }
//
//    public static void dPlace(int arr[],int n,int d)
//    {
//        for(int i=0;i<d;i++)
//        {
//            onePlaces(arr,n,d);
//        }
//    }



    // reversal algorithm
    public static void dPlace(int arr[],int n,int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void reverse(int arr[],int low,int high)
    {
        while (low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

        }
    }

    public void Onerotate(int[] nums, int k,int n) {


        int temp=nums[n-1];
        for(int i=n-2;i>0;i--)
        {
            nums[i+1]=nums[i];
        }
        nums[0]=temp;
    }
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        for(int i=0;i<k;i++)
        {
            Onerotate(nums,k,n);
        }
    }

    public static void main(String[] args) {

    }
}
