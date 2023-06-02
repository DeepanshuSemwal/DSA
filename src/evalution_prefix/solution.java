package evalution_prefix;

import java.util.Stack;

public class solution {

    // same as evalute in postfix
    public static int evaluatePostFix(String S)
    {
        Stack<Integer>stack=new Stack<>();
        for(int i=S.length()-1;i>=0;i--)
        {
            char ch=S.charAt(i);
            if(ch=='+' || ch=='-'||ch=='*'||ch=='/')
            {
                if(ch=='+')
                {
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.add(a+b);
                }
                else if(ch=='-')
                {
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.add(a-b);
                }
                else if(ch=='*')
                {
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.add(a*b);
                }
                else if(ch=='/')
                {
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.add(a/b);
                }
            }
            else
            {
                stack.add(ch-'0');
            }

        }
        return stack.pop();
    }
}
