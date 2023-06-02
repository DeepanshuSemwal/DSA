package largest_rectangle_with_all_1s;

import java.util.Stack;

public class solution {

    public static int RectangleWith1s(int arr[][],int n,int m)
    {
        int curRow[]=arr[0];
        int res=largestHistorgramArea(curRow,n);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                {
                    curRow[j]+=1;
                }
                else
                {
                    curRow[j]=0;
                }
            }
            res=Math.max(res,largestHistorgramArea(curRow,n));
        }
        return res;
    }


    public static int largestHistorgramArea(int arr[],int n)
    {
        int ns[]=nextSmaller(arr,n);
        int ps[]=previousSmaller(arr,n);
        int res=0;
        for(int i=0;i<n;i++)
        {
            int cur=(ns[i]-ps[i]-1)*arr[i];
            res=Math.max(res,cur);
        }
        return res;
    }

    public static int[]previousSmaller(int arr[],int n)
    {
        Stack<Integer>stack=new Stack<>();
        int res[]=new int[n];
        int index=0;
        res[0]=-1;
        index++;
        stack.add(0);
        for(int i=1;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()])
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
        Stack<Integer>stack=new Stack<>();
        int res[]=new int[n];
        int index=n-1;
        res[n-1]=-1;
        index--;
        stack.add(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()])
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
        }
        return res;
    }
}
