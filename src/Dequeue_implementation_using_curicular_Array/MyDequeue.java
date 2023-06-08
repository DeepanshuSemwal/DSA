package Dequeue_implementation_using_curicular_Array;

// using circular Array
public class MyDequeue {

    int cap;
    int size;
    int arr[];
    int front;
    int rear;
    MyDequeue(int c)
    {
        cap=c;
        arr=new int[cap];
        front=0;
        rear=cap-1;
    }

    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isFull()
    {
        return size==cap;
    }
    public int getRear()
    {
        if(isEmpty())
        {
            return -1;
        }

       return arr[front+size-1]; // rear
    }
    public int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }

        return arr[front];
    }
    public void insertRear(int x)
    {
        if(isFull())
        {
            return;
        }
        int res=arr[front+size]%cap;//arr[front+size-1] if this rear position can we say that if we add 1 to it then it become next poistion of rear where we have to insert the element
        size++;
    }
    public void insertFront()
    {
        if(isFull())
        {
            return;
        }
        int res =arr[front+cap-1]%cap;
        size++;
    }
    public void deleteFront()
    {
        if(isEmpty())
        {
            return;
        }
        front=(front+1)%cap;
        size--;
    }
    public void deleteRear()
    {
        if(isEmpty())
        {
            return;
        }
        size--;

    }


}
