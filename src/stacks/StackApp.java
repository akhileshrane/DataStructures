package stacks;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        //stack.print();
        
        
        int elem = stack.pop();
        System.out.println("POP" + elem);
        
        System.out.println(stack.peek());
        
        stack.pop();
  
        
        System.out.println("PEEK" + stack.peek());

        System.out.println(stack);
        //stack.pop();
        stack.push(560);
        
        
        System.out.println(stack);
        System.out.println(stack.pop());

        stack.pop();

        System.out.println(stack.isEmpty());
    }
}
