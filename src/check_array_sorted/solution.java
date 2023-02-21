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


        return true;
    }
}
