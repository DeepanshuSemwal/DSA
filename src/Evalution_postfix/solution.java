package Evalution_postfix;

import java.util.Stack;

public class solution {

        // Your code here
        public static int evaluatePostFix(String S)
        {
            // Your code here
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    if (ch == '+') {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.add(a + b);

                    } else if (ch == '-') {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.add(b - a); // note : note second element will be greater
                    } else if (ch == '*') {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.add(a * b);
                    } else if (ch == '/') {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.add(b / a); // note second element will be greater
                    }

                } else {
                    stack.add(ch - '0');
                }
            }
            return stack.pop();
        }
    }

