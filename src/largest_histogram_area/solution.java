package largest_histogram_area;

import java.util.Stack;

public class solution {

    // navie approach
    public static int Histogram(int arr[],int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            int cur=arr[i];
            for(int j=i-1;j>=0;j--) // we are checking on the left side
            {
                if(arr[j]>=arr[i])
                {
                    cur+=arr[i];
                }
                else {
                    break;
                }
            }
            for(int j=i+1;j<n;j++) // we are checking on the right side
            {
                if(arr[j]>=arr[i])
                {
                    cur+=arr[i];
                }
                else
                {
                    break;
                }
            }
            res=Math.max(res,cur);

        }
        return res;
    }

    // efficeinet approach
    // check doubt code leetcode
    public int largestRectangleArea(int[] heights)
    {
        int n=heights.length;
        int nextSmaller[]=nextSmaller(heights,n);
        int prevSmaller[]=prevSmaller(heights,n);
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=Math.max(res,(nextSmaller[i]-prevSmaller[i]-1)*heights[i]);
        }
        return res;
    }

    public static int[]prevSmaller(int arr[],int n)
    {
        int res[]=new int[n];
        int index=0;
        res[index]=-1;
        Stack<Integer>stack=new Stack<>();
        stack.add(0); // we are stroing index of the elemnt in the stack
        for(int i=1;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[index]=-1;
                index++;
            }
            else
            {
                res[index]=arr[stack.peek()];
                index++;
            }
            stack.add(i);
        }
        return res;

    }

    public static int[]nextSmaller(int arr[],int n)
    {
        int res[]=new int[n];
        int index=n-1;
        res[index]=-1;
        index--;
        Stack<Integer>stack=new Stack<>();
        stack.add(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[index]=-1;
                index--;
            }
            else
            {
                res[index]=arr[stack.peek()];
                index--;
            }
            stack.add(i);
        }
        return res;
    }
}
