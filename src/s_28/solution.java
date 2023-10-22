package s_28;

public class solution {
    public int maxArea(int[] arr) {

        // check the code
        int n=arr.length;
        int low=0;
        int high=n-1;
        int res=0;
        while(low<high)
        {
            int lh=arr[low];
            int rh=arr[high];
            int min_height=Math.min(lh,rh);
            int distance=high-low;
            res=Math.max(res,min_height*distance);
            if(lh<rh)
            {
                low++;
            }
            else  if(lh>rh)
            {
                high--;
            }
        }
        return res;
    }
}
