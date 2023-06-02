package reverse_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class solution {

    // using recursion
    public Queue<Integer> rev1(Queue<Integer> q){
        //add code here.
        // using recursion
         helper(q);
         return q;
    }

    public void helper(Queue<Integer>queue)
    {
        if(queue.isEmpty())
        {
            return;
        }
        int x= queue.peek();
        queue.remove();
        helper(queue);
        queue.add(x);
    }


    // using stack
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer>stack=new Stack<>();
        while (!q.isEmpty())
        {
            stack.add(q.poll());
        }
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        return q;
    }
}
