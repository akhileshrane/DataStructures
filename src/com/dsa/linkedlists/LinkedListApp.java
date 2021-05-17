package com.dsa.linkedlists;

import java.util.Arrays;


public class LinkedListApp {

    public static void main(String[] args) {
 
        var list = new LinkedList();
        list.addFirst(10);
        list.addFirst(50);
        list.addLast(70);
        list.addLast(140);
        list.addLast(566);
        list.addLast(443);
        list.addLast(856);
        list.addLast(34);
        list.addFirst(5);

        System.out.println(list.print());

        list.deleteFirst();
        System.out.println(list.print());

        list.deleteFirstGCFriendly();
        System.out.println(list.print());

        System.out.println(list.contains(5));

        list.deleteLast();
        System.out.println(list.print());

        System.out.println(list.size());

        System.out.println(Arrays.toString(list.toArray()));

        
        list.reverse();
        System.out.println(list.print());
        
    }
    
    
}
