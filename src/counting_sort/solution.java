package counting_sort;

public class solution {
    public  static void countingSort(int arr[],int n,int k)
    {
        int[] count=new int[k];
        for(int i=0;i<k;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        // we built count array
        // and now
        for(int i=1;i<k;i++)
        {
            count[i]=count[i-1]+count[i];
        }
        // making output array
        int output[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            output[count[arr[i]-1]]=arr[i];
            count[arr[i]]--;
        }
        // copy output array to arr
        for(int i=0;i<n;i++)
        {
            arr[i]=output[i];
        }



    }
}
