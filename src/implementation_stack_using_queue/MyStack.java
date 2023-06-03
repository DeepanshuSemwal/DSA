package implementation_stack_using_queue;


import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    int cap;
    int size;
    MyStack(int c)
    {
        cap=c;
        size=0;
    }
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer>q2=new LinkedList<>();
    public void push(int x)
    {
        if(size==cap)
        {
            return;
        }
        if(q1.isEmpty())
        {
            q1.add(x);
        }
       else
        {
            while(!q1.isEmpty())
            {
                    q2.add(q1.peek());
                    q1.remove();
            }
            q1.add(x);
            while(!q2.isEmpty())
            {
                q1.add(q2.peek());
                q2.remove();
            }
        }
       size++;
    }
    public int pop()
    {
        if(size==0 || q1.isEmpty())
        {
            return -1;
        }
        int res= q1.peek(); // we can also do queue.poll();
        q1.remove();
        size--;
        return res;
    }
    public int getSize()
    {
        return size;
    }
    public int peek()
    {
        if(q1.isEmpty())
        {
            return -1;
        }
        return q1.peek();
    }




}
