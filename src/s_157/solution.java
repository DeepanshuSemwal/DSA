package s_157;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class solution {

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        // 1 2 3 4 5
        // add code here.
        // use stack and put first k elements in the stack
        Stack<Integer> stack = new Stack<>();
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0; i<k; i++) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while(!q.isEmpty())
        {
            queue.add(q.poll());
        }
        return queue;

    }
}
