package check_array_sorted;

public class solution {
    public static boolean check(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }

        int low=0;
        int high=n-1;

        return true;
    }
}
