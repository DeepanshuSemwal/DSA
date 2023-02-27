package s_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {

    public List<List<Integer>> threeSum(int[] arr, int target) {

        List<List<Integer>>res=new ArrayList<>();
        int n=arr.length;
        if(n<3)
        {
            return res;
        }
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++)
        {
            if(i!=0 && arr[i]==arr[i-1])
            {
                continue;
            }
            int val=arr[i];
            int tar=target-val;
            List<List<Integer>>subRes=twoSum(arr,tar,i+1,n-1);
            /*
            subResult
                {
                   (2,7)
                    (3,9)
                   (4,1)
                }
                final result
                {
                 (2,7,val)
                 (3,7,val)
                 (4,7,val)

             */
            for(List<Integer>list:subRes)
            {
                list.add(val);
                res.add(list);
            }


        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] arr, int tar, int start, int end) {

        int left=start;
        int right=end;
        List<List<Integer>>res=new ArrayList<>();
        while(left<right)
        {
            if(left!=start && arr[left]==arr[left-1])
            {
                continue;
            }
            int sum=arr[left]+arr[right];
            if(sum==tar)
            {
                List<Integer>subRes=new ArrayList<>();
                subRes.add(arr[left]);
                subRes.add(arr[right]);
                res.add(subRes);
            }
            else if(sum>tar)
            {
                right--;
            }
            else if(sum<tar)
            {
                left++;
            }
        }
        return res;

    }

    // recommended solution

    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            if(i==0 || (i>0 && arr[i]!=arr[i-1]))
            {
                int sum=0-arr[i];
                int low=i+1;
                int high=n-1;
                while(low<high)
                {
                    if(arr[low]+arr[high]==sum)
                    {
                        res.add(Arrays.asList(arr[i],arr[low],arr[high]));
                        while(low<high && arr[low]==arr[low+1])
                        {
                            low++;
                        }
                        while(low<high && arr[high]==arr[high-1])
                        {
                            high--;
                        }
                        low++;
                        high--;

                    }
                    else if(arr[low]+arr[high]<sum)
                    {
                        low++;
                    }
                    else if(arr[low]+arr[high]>sum)
                    {
                        high--;
                    }

                }

            }

        }
        return res;
    }


}
