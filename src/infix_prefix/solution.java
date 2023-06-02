package infix_prefix;

import java.util.Stack;

public class solution {


    // ek baar check karlena
    // code will be same as postfix but a little bit changes

    public static String infixToPostfix(String str) {
        // Your code here
        Stack<Character> stack=new Stack<>();
        String output="";
        for (int i = str.length()-1; i >= 0; i--) {
            if (isCharacterorDigit(str.charAt(i))) {
                output += str.charAt(i);
            } else if (str.charAt(i) == ')') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
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
        reverse(output);
        return output;

    }


    public static void reverse(String str)
    {
        int low=0;
        int high=str.length()-1;
        char[]temp=str.toCharArray();
        while(low<=high)
        {
            char temp1=temp[low];
            temp[low]=temp[high];
            temp[high]=temp1;
        }
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
    public static boolean isCharacterorDigit(char ch)
    {
        return Character.isLetterOrDigit(ch);
    }
}
