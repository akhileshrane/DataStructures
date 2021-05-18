package stacks;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack {
    private int[] stack = new int[10];
    private int size=0;

    public void push(int element){
        growArray();
        stack[size++] = element;
    }

    public int peek(){
        if(size==0) throw new IllegalStateException();
        return stack[size-1];
    }

    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        } else {
            return stack[--size];
        }
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void print(){
       for(int i=0; i < size; i++){
           System.out.println(stack[i]);
       }
    }

    public void growArray(){
        if(size > 0.75*stack.length){
            int[] newArr = new int[size*2];
            for(int i=0; i<stack.length; i++){
                newArr[i] = stack[i];
            }
            stack = newArr;
        }
    }

    @Override
    public String toString(){
        int[] newArr = Arrays.copyOfRange(stack, 0, size);
        return Arrays.toString(newArr);
    }
}
