package s_26;

public class solution {

    //Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
    //Output: true
    public static boolean givenSumInRotated(int arr[],int n,int x)
    {
        // find pivot element
        int i;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                break;
            }
        }

        int l=(i+1)%n;
        int r=i;
        while(l!=r)
        {
            if(arr[l]+arr[r]==x)
            {
                return true;
            }
            else if(arr[l]+arr[r]<x)
            {
                l=(l+1)%n;
            }
            else if(arr[l]+arr[r]>x)
            {
                r=(n+r-1)%n;
            }
        }
        return false;

    }

}
