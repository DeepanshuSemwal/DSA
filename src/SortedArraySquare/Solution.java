package SortedArraySquare;

public class Solution {

    public int[] sortedSquares(int[] nums) {

        int i=0;
        int j=nums.length-1;
        int n=nums.length;
        int arr[]=new int[n];
        for(int z=n-1;z>=0;z--)
        {
            if(Math.abs(nums[j])<Math.abs(nums[i]))
            {
                arr[z]=nums[i]*nums[i];
                i++;
            }
            else
            {
                arr[z]=nums[j]*nums[j];
                j--;
            }
        }
        return arr;

    }
}
