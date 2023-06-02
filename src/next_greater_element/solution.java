package next_greater_element;

import java.util.Stack;

public class solution {

    // navie approach
    public static int[] nextGreater1(int arr[],int n)
    {
        int res[]=new int[n];
        int index=0;
        boolean flag=false;
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;i++)
           {
               if(arr[j]>arr[i])
               {
                   flag=true;
                   res[index]=arr[j];
                   index++;
                   break;
               }
               flag=false;
           }
           if(flag==false)
           {
               res[index]=-1;
               index++;
           }
       }
       return res;
    }


    // effcient approach
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[]res=new long[n];
        int index=n-1;
        res[index]=-1;
        index--;
        Stack<Long> stack=new Stack<>();
        stack.add(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[i]>=stack.peek())
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
                res[index]=stack.peek();
                index--;
            }
            stack.add(arr[i]);
        }
        return res;
    }

}
