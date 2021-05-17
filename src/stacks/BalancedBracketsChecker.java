package stacks;

import java.util.Stack;

public class BalancedBracketsChecker {

    private String expression;

    private BalancedBracketsChecker(String str){
        this.expression = str;
    }

    public boolean isBalanced ()
    {   
        boolean var = false;
        Stack<Character> bracketStack = new Stack<>();

        for(char ch : expression.toCharArray()){
            if(ch == '(' || ch == '<' || ch == '[' || ch == '{' ){
                bracketStack.push(ch);
            }

            if( ch == ')' || ch == '>' || ch == ']' || ch == '}'  ) {
                if(bracketStack.empty()) 
                    return false;
                
                char previousBracket = bracketStack.pop();


                if ( (previousBracket == '(' && ch == ')') || 
                (previousBracket == '{' && ch == '}') ||
                (previousBracket == '[' && ch == ']') || 
                (previousBracket == '<' && ch == '>') ) {
                    System.out.println("Match pair found " + previousBracket + " " + ch);
                    var = true;
                } else {
                  return false;
                }
            }
        }

        if(!bracketStack.empty()){
           return false;
        }
        return var;
    }

    public static void main(String[] args) {
        BalancedBracketsChecker br = new BalancedBracketsChecker("((({a+b})))");

        System.out.println(br.isBalanced());
    }
}
