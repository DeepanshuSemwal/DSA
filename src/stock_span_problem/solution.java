package stock_span_problem;

import java.time.chrono.MinguoDate;
import java.util.Stack;

public class solution {

    // navie approach
    public int[] stockSpan1(int arr[],int n)
    {
        int res[]=new int[n];
        int index=0;
        res[index]=1;
        int cur=1;
        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i]>=arr[j])
                {
                    cur++;
                }
            }
            arr[index]=cur;
            cur=1;
        }
        return res;
    }

    // efficient approach
    public int[] stockSpan(int arr[],int n)
    {
        int res[]=new int[n];
        int index=0;
        Stack<Integer>stack=new Stack<>();
        stack.add(0);
        res[index]=1;
        index++;
        for(int i=1;i<n;i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[index]=i+1; // the current element is greater
                index++;

            }
            else
            {
                res[index]=i-stack.peek();
                index++;
            }
            stack.add(i);
        }
        return res;
    }

}
