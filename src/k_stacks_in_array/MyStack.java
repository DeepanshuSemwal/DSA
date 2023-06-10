package k_stacks_in_array;

public class MyStack {

    int arr[];
    int top[];
    int next[];
    int k;
    int cap;
    int freeTop;
    MyStack(int K,int c)
    {
        k=K;
        cap=c;
        freeTop=0;
        next=new int[cap];
        top=new int[k];
        arr=new int[k];
        for(int i=0;i<k;i++)
        {
            top[i]=-1;
        }
        for(int i=0;i<cap-1;i++)
        {
            next[i]=i+1;
        }
        next[cap-1]=-1;
    }
    public void push(int s,int x)
    {
        int i=freeTop;
        freeTop=next[i];
        next[i]=top[s];
        top[s]=i;
        arr[i]=x;
    }

    public int pop(int s)
    {
        int i=top[s];
        top[s]=next[i];
        next[i]=freeTop;
        freeTop=i;
        return arr[i];

    }
    public boolean isEmpty(int s)
    {
        return top[s]==-1;
    }
}
