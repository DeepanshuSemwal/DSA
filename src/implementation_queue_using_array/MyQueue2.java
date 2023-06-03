package implementation_queue_using_array;

public class MyQueue2 {

    // using ciruclar Array
    // front=(front+1)%cap;
    // rear=(rear+1)%cap;
    int cap;
    int size;
    int arr[];
    int front;
    int rear;
    MyQueue2(int c)
    {
        cap=c;
        size=0;
        front=0;
        rear=size-1;
        arr=new int[cap];
    }

    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isFull()
    {
        if(cap==size)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public int getRear()
    {
        if(isEmpty())
        {
            return -1;
        }
        return (front+size-1)%cap;
    }
    public void Enqueue(int x)
    {
        if(isFull())
        {
            return;
        }
        int rear=getRear();
        rear=(rear+1)%cap;
        arr[rear]=x;
        size++;
    }
    public int Dequeue()
    {
        if(isEmpty())
        {
            return -1;
        }
        int res=arr[front];
        front=(front+1)%cap;
        size--;
        return res;
    }
}
