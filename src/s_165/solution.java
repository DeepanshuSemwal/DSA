package s_165;

import java.util.Stack;

public class solution {


    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        if(!s.isEmpty())
        {
            int x=s.pop();
           sort(s);
           sortedInsert(s,x);

        }
        return s;


    }

    static void sortedInsert(Stack<Integer> s, int x)
    {

        if (s.isEmpty() || x > s.peek()) {
            s.add(x);
            return;
        }

        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }
}
