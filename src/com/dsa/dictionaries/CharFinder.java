package com.dsa.dictionaries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {

    public static char getFirstNonRepeatingChar(String text){
        Map<Character, Integer> occurenceMap = new HashMap<>();
        char[] chArr = text.toCharArray();
        for(char ch : chArr){
            if(ch!=' ') {
                if(occurenceMap.containsKey(ch))
                    occurenceMap.put(ch, occurenceMap.get(ch)+1);
                else {
                    occurenceMap.put(ch, 1);
                }
            }
        }
        System.out.println(occurenceMap);
        for(char ch : chArr){
            if(ch!=' ')
                if(occurenceMap.get(ch) == 1)
                    return ch;
        }
        return Character.MIN_VALUE;
    }

    public static char getFirstRepeatingChar(String text){
        Set<Character> chars = new HashSet<>();

        for(char ch : text.toCharArray())
        {
            if(chars.contains(ch))
                return ch;
           
            chars.add(ch);
            
        }
        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        String text = "a green apple";
        System.out.println("First non repeating character: " + getFirstNonRepeatingChar(text));
        System.out.println("First repeating character: " +  getFirstRepeatingChar(text));
    }
}
