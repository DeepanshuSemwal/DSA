package s_42;

import java.util.Stack;

public class solution {

    public boolean isValid(String s)
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[')
            {
                stack.add(s.charAt(i));
            }
            else
            {
                // we get first element as a closing bracket
                if(stack.isEmpty())
                {
                    return false;
                }
                else if((c==')' && stack.pop()=='(') || (c=='}' && stack.pop()=='{') || (c==']' && stack.pop()=='['))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
