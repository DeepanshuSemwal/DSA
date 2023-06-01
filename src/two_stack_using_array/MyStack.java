package two_stack_using_array;

public class MyStack
{
    int cap;
    int arr[];
    int size;
    int top1;
    int top2;
    MyStack(int c)
    {
        cap=c;
        arr=new int[cap];
        top1=-1;
        top2=cap;
    }

    public void push1(int x)
    {
        if(top1<top2-1)
        {
            top1++;
            arr[top1]=x;
        }
    }
    public void push2(int x)
    {
        if(top1<top2-1)
        {
            top2--;
            arr[top2]=x;
        }
    }
    public int pop1()
    {
        if(top1>=0)
        {
            int res=arr[top1];
            top1--;
            return top1;
        }
        return -1; // it indicate stack1 is empty

    }
    public int pop2()
    {
        if(top2<cap)
        {
            int res=arr[top2];
            top2++;
            return res;
        }
        return -1; // it indicate stack1 is empty
    }
    public int size1()
    {
        return top1+1;
    }
    public int size2()
    {
        return cap-top2;
    }


}
