package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class WalmartTest3 {

    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<Character>();
        //String s = “{}[()]”;
        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(s.charAt(i));
                continue;
            }

            if(stack.isEmpty()) return false;

            char z;
            switch (ch){
                case '}':
                    z = stack.pop();
                    if(z == '(' || z == '[') return false;
                    break;

                case ']':
                    z = stack.pop();
                    if(z == '{' || z == '(') return false;
                    break;

                case ')':
                    z = stack.pop();
                    if(z == '{' || z == '[') return false;
                    break;
            }

        }

        return (stack.isEmpty());

    }

    public static void main(String[] args){

        String s = "{}[()]";

        System.out.println(isBalanced(s));
    }
}
