package max_subarray_sum_with_target;

public class solution {

    public int maxSubArrayLen( int[] arr,int n,int k) {

        // navie apporach
        int cur=0;
        int res=0;
        for(int i=0;i+k-1<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                cur+=arr[i+j];
            }
            res=Math.max(res,cur);
        }
        return res;
    }
    //efficient appraoch
    public int maxSubArrayLen2( int[] arr,int n,int k)
    {
        int cur=0;
        int res=0;
        for(int i=0;i<k;i++)
        {
            cur+=arr[i];
        }
        res=cur;
        for(int i=k;i<n;i++)
        {
            cur=cur+arr[i]-arr[i-k];
            res=Math.max(res,cur);
        }
        return res;

    }



}
