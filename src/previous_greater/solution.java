package previous_greater;

import java.util.Stack;

public class solution {

    // navie
    public static int[] previousGreater1(int arr[],int n)
    {
        int res[]=new int[n];
        int index=0;
        res[index]=-1;
        index++;
        boolean flag=false;
        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>arr[i])
                {
                    res[index]=arr[j];
                    index++;
                    flag=true;
                    break;
                }
                else
                {
                    flag=false;
                }
            }
            if(flag==false)
            {
                arr[index]=-1;
                index++;
            }
        }
        return res;
    }

    // effcient approach
    public static int[] previousGreater(int arr[],int n)
    {
        int res[]=new int[n];
        int index=0;
        Stack<Integer>stack=new Stack<>();
        stack.add(arr[0]);
        res[index]=-1;
        index++;
        for(int i=1;i<n;i++)
        {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
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
                res[index]=stack.peek();
                index++;
           }
           stack.add(arr[i]);

        }
        return res;
    }

}
