package array_implementation_stack;

public class solution {


}

class MyStack
{
    int c;
    int arr[];
    int top;
    MyStack(int c)
    {
        top=-1;
        arr=new int[c];
    }
    public void push(int x)
    {
        if(top==c)
        {
            return;
        }
        top++;
        arr[top]=x;
    }
    public int pop()
    {
        if(top==-1)
        {
            return -1;
        }
        int res=arr[top];
        top--;
        return res;
    }
    public int size()
    {
        return top+1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
}
