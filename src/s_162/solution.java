package s_162;

import java.util.Stack;

public class solution {

    public static int checkRedundancy(String s) {
        // code here
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    char top = stack.pop();
                    boolean flag = true; // there are redundant brackets

                    while (!stack.empty() && top != '(') {

                        // Check for operators in expression
                        if (top == '+' || top == '-' || top == '*' || top == '/')
                            flag = false;

                        top = stack.pop();
                    }

                    if (flag)
                        return 1; // there are redundant brackets
                }
            }

        }

        return 0;
    }




    }

