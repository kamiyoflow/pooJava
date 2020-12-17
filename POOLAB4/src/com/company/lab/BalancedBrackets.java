package com.company.lab;
import java.util.Stack;

public class BalancedBrackets {

    public void check (String exp){

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(')
                stack.push(i);
            if (ch == ')') {
                if (stack.empty()) {
                    System.out.println("Expression is incorrect");
                    System.exit(0);
                }

                else if (!stack.empty())
                    stack.pop();
            }
        }

        if (stack.empty())
            System.out.println("Expression is correct");
        else if (!stack.empty() )
            System.out.println("Expression is incorrect");
    }
}