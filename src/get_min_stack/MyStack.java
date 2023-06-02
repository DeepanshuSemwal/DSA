package get_min_stack;

import java.util.Stack;

public class MyStack {

    Stack<Integer>stack=new Stack<>();

    int min;

    public void push(int x)
    {
        if(stack.isEmpty())
        {
            stack.add(x);
            min=x;
        }
        else if(x<=min)
        {
            stack.push(2*x-min);
            min=x;
        }
        else
        {
            stack.add(x);
        }
    }
    public int pop()
    {
        int t=stack.pop();
        if(t<=min)
        {
            int res=min;
            min=2*min-t;
            return res;
        }
        return t;
    }
    public int getMin()
    {
        return min;
    }
    public int getPeek()
    {
        int t=stack.peek();
        if(t<=min)
        {
            return min;
        }
        else
        {
            return t;
        }
    }


    // navie
    class MyStack2
    {
        Stack<Integer>mainStack=new Stack<>();
        Stack<Integer>auxStack=new Stack<>();
        public void push(int x) {
            if (stack.isEmpty()) {

                mainStack.add(x);
                auxStack.add(x);
            } else if (mainStack.peek() <= auxStack.peek()) {
                auxStack.add(x);
            }
            else
            {
                mainStack.add(x);
            }


        }

        public int pop()
        {
            if(mainStack.peek()==auxStack.peek())
            {
                auxStack.pop();
            }
          return  mainStack.pop();

        }
        public int getMin()
        {
            return auxStack.pop();
        }
        public int getPeek()
        {
           return mainStack.peek();
        }
    }
}


