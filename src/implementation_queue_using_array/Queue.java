package implementation_queue_using_array;

public class Queue {

    int cap;
    int size;
    int arr[];
    Queue(int c)
    {
        cap=c;
        arr=new int[cap];
        size=0;
    }

    public void enqueue(int x)
    {
        if(size==cap)
        {
            return;
        }
        arr[size]=x;
        size++;
    }
    public void deqeue()
    {
        if(size==0)
        {
            return; // queue is empty
        }
        for(int i=1;i<size;i++)
        {
            arr[i-1]=arr[i];
        }
        size--;

    }

    public int getFront()
    {
        if(size==0)
        {
            return -1;
        }
        return arr[0];
    }
    public int getRear()
    {
        if(size==0)
        {
            return -1;
        }
        return arr[size-1];

    }

    // effcient implementation using circular array
}
