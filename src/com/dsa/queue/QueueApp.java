package com.dsa.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import stacks.Stack;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        //add,remove,isEmpty
        Stack stack = new Stack();
        while(!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        
        
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

    }
}
