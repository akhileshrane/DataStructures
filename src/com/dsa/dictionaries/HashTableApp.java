package com.dsa.dictionaries;

public class HashTableApp {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.put(10, "Abc");

        System.out.println(ht.get(10));
    }
}
