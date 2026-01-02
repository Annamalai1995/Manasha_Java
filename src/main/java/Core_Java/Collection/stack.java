package Core_Java.Collection;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> ss= new Stack();  // generic
        ss.push(1452);
        ss.push(4578);
        ss.push(7888);
        ss.push(4545);
        System.out.println("Stack Values:"+ss);
        ss.pop();
        System.out.println("Pop Values "+ss);
        //Peek
        System.out.println("PEEK VALUES"+ss.peek());
        System.out.println("EMPTY STACK"+ss.empty());
        System.out.println("Search STACK"+ss.search(4578));


    }
}
