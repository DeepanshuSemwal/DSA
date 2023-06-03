package implementation_of_deque_using_array;

import javax.swing.text.SimpleAttributeSet;
import java.util.ArrayDeque;
import java.util.Stack;

public class MyDeueue {

int cap;
int size;
int arr[];
MyDeueue(int c)
{
    cap=c;
    arr=new int[cap];
    size=0;
}

public void insertFront(int x)
{
    if(size==cap)
    {
        return;
    }
    for(int i=size-1;i>=0;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[0]=x;
    size++;
}

public void insertRear(int x)
{
    if(size==cap)
    {
       return;
    }
    arr[size]=x;
    size++;
}
public void deleteRear()
{
    if(size==0)
    {
        return;
    }
    size--;

}
public void deleteFront()
{
    if(size==0)
    {
        return;
    }
    for(int i=1;i<size;i++)
    {
        arr[i-1]=arr[i];
    }
    size--;

}

    public static void main(String[] args) {

    // dequeue as stack

        ArrayDeque<Integer>stack=new ArrayDeque<>();
        stack.push(10);
        stack.pop();

        // dequeue as Queue
        ArrayDeque<Integer>queue=new ArrayDeque<>();
         // queue.add(10);
//        queue.add(20);
//        queue.poll();

        queue.offer(10);
        queue.offerFirst(20);
        queue.offer(1);
        System.out.println(queue.peekFirst());
        // peek and peekFirst are same

    }

    public static void eraseAt(ArrayDeque<Integer> deq , int X)
    {
        //Your code here
        deq.remove(X);

    }

    //Function to erase the elements in range start (inclusive), end (exclusive).
    public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
    {
        //Your code here
        while(start<=end)
        {
            deq.remove();
            start++;
        }
    }

    //Function to erase all the elements in the deque.
    public static void eraseAll(ArrayDeque<Integer> deq )
    {
        //Your code here
        while(!deq.isEmpty())
        {
            deq.remove();
        }
    }



}
