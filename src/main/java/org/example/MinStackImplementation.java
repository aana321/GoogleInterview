package org.example;

import java.util.Stack;

public class MinStackImplementation {

    private static Stack<Integer> stack;
    private static Stack<Integer> minStack;

    public MinStackImplementation(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    void push(int x){
        stack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    void pop(int x){
        if(stack.pop().equals(minStack.peek())){
            minStack.pop();
        }

    }

    int top(){
       return stack.peek();
    }

    int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args){

    }
}
