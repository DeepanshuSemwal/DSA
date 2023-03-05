package minimum_operation_make_an_array_element_equal;

public class solution {
    // Input : arr[] = {1, 2, 3, 4}
    // Output : 3

    public static int min_operation(int arr[],int n)
    {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,arr[i]);
            sum+=arr[i];
        }
        return sum-n*min;
    }
}
