package beautiful_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class solution {

    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.add(arr[i]);
            }
            else if(stack.peek()>=0 && arr[i]<0 || stack.peek()<0 && arr[i]>=0)
            {
                stack.pop();
            }
            else
            {
                stack.add(arr[i]);
            }
        }
        while(!stack.isEmpty())
        {
            res.add(stack.pop());
        }
        Collections.reverse(res);
        return res;
    }
}
