package s_79;

public class solution {
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function

        int i=0;
        while(i<n)
        {
            if(arr[i]==x)
            {
                return i;
            }
            i=i+Math.max(1,Math.abs(arr[i]-x)/k);

        }
        return -1;
    }
}
