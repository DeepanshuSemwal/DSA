package infix_to_postfix;

import java.util.Stack;

public class solution {


    public static String infixToPostfix(String str) {
        // Your code here
        Stack<Character>stack=new Stack<>();
        String output="";
        for (int i = 0; i < str.length(); i++) {
            if (isCharacter(str.charAt(i))) {
                output += str.charAt(i);
            } else if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char a = stack.pop();
                    output += a;
                }
                stack.pop();

            } else {
                while (!stack.isEmpty() && precedence(str.charAt(i))<=precedence(stack.peek())) {
                    char a = stack.pop();
                    output += a;
                }
                stack.push(str.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            char a = stack.pop();
            output += a;
        }
        return output;
    }


    public static int precedence(char ch)
    {
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else if(ch=='*' || ch=='/')
        {
            return 2;
        }
        else if(ch=='^')
        {
            return 3;
        }
        return 0;
    }
    public static boolean isCharacter(char ch)
    {
        return Character.isLetterOrDigit(ch);
    }

}
