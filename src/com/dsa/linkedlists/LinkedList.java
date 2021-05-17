package com.dsa.linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item){
        var node = new Node(item);
        size++;

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public void addLast(int item){
        var node = new Node(item);
        size++;

        if(isEmpty())
            first = last = node;
        else { 
           
            last.next = node;
            last = node;
        }    
    }

    public void deleteFirst(){
        if(!isEmpty()){
            size--;
            first = first.next;
        }
    }

    public void deleteFirstGCFriendly(){
        if(isEmpty()){
            throw new NoSuchElementException();
        } else if (first == last) {
            size--;
            first = last = null;
        }
        else {
            size--;
            var second = first.next;
            first.next = null;
            first = second;
        }
    }

    public void deleteLast() {
        if(!isEmpty()){
        var current = first;
            while(current != null) { 
                if(current.next == last){
                    size--;
                    current.next = null;
                    last = current;
                } else {
                    current = current.next;
                } 
            }
        } else{
            throw new NoSuchElementException();
        }
    }

    public int indexOf (int item){
        int index = 0;
        var current = first;
        while(current != null) { 
            if(current.value == item) {
                return index;
            } else { 
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains (int item){
        return indexOf(item) != - 1;
    }
    
    public int size() {
       return size;
        
    }

    public String print() {
        StringBuilder str = new StringBuilder("LinkedList - ");
        if(!isEmpty()){
            var current = first;
            while(current != null) { 
                str.append(current.value + " --> ");
                current = current.next;
        }
     }
     return str.toString();
    }

    public int[] toArray(){
        int[] arr = new int[size];
        
        int index = 0;

        if(!isEmpty()){
            var current = first;
            while(current!=null){
                arr[index++] = current.value;
                current = current.next;
            }
        }
        return arr;
    }

    public void reverse(){

        if(!isEmpty()) {
        var firstNode = first;
        var secondNode = first.next;

        while(secondNode != null) {
            var next = secondNode.next;
            secondNode.next = firstNode;
            firstNode = secondNode;
            secondNode = next;  
        }

        //setting first and last counters
        last = first; 
        last.next = null;
        first = firstNode;
      }
    }
    
    private boolean isEmpty(){
        return first == null;
    }
}
