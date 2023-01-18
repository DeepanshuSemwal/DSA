package max_min_array;

public class solution {

    public static int max(int arr[],int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static int min(int arr[],int n)
    {
        int min=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

   public static int maxDiff(int arr[],int n)
   {
       int min=min(arr,n);
       int max=max(arr,n);
       return max-min;

   }

    public static void main(String[] args) {

    }
}
