package com.dsa.queue;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue = new int[10];
    int front=0;
    int back=0;

    public void enqueue(int element){
        queue[back] = element;
        back = (back+1) % queue.length;
    }

    public int dequeue(){
        if(front<back) {
            var item = queue[front];
            front = (front + 1) % queue.length; //ciculular array -- loop between 0 to length using modulus. ex: index 10 - (9+1) % 10 = back to index 0
            return item;
        } else {
            throw new IllegalStateException();
        }
    }

    public int peek(){
        return queue[front];
    }

    public boolean isEmpty(){
        return front==back;
    }

    
    public boolean isFull(){
        return back==queue.length;
    }

    @Override
    public String toString(){
        int[] arr = Arrays.copyOfRange(queue, front, back);
        return Arrays.toString(arr);
    }
}
