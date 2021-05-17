package stacks;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String string){
        if(string==null)
            throw new IllegalArgumentException();
        

        Stack <Character> charStack = new Stack<>();
        for(char i : string.toCharArray())
            charStack.push(i);
        

        StringBuilder reversed = new StringBuilder();
        while(!charStack.empty())
            reversed.append(charStack.pop());
        

        return reversed.toString();
    } 

    public static void main(String[] args) {
        String string = "reverseThisString";
        
        String reversedStr = reverseString(string);
        System.out.println(reversedStr);
    }
}
