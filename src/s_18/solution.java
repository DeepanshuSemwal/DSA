package s_18;

public class solution {



    public void nextPermutation(int[] nums) {

        if(nums.length==0||nums.length==1)
        {
            return;
        }
        int i=nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=nums.length-1;
            while (j>=0 && nums[j]<=nums[i])
            {
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        reverse(nums,i+1,nums.length-1);

    }

    public static void reverse(int arr[],int low,int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
