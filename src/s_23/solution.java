package s_23;

public class solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int product=1;
        for(int i=0;i<n;i++)
        {
            product*=nums[i];
            left[i]=product;
        }
        product=1;
        for(int i=n-1;i>0;i--)
        {
            left[i]=left[i-1]*product;
            product*=nums[i];
        }
        left[0]=product;
        return left;
    }
}
