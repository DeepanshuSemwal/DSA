package sum_subset_recursion;

public class solution {

    // count subaary with given sum
    public static int countSum(int arr[],int n,int sum)
    {

        if(n==0)
        {
            if(sum==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        // iam traversing right side to make it simple
        // either i can include it or not
        return countSum(arr,n-1,sum)+countSum(arr,n-1,sum-arr[n-1]);



    }

}
