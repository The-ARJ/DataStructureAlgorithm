package Weekly.Week3;

import java.util.Stack;

public class StackDataStructure {
    // Stack

    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        a.push("a");
        a.push("b");
        a.push("c");
        System.out.println(a.pop()+a.pop()+a.pop());

    }
    // USE CASE: undo and redo, compiler uses to check parenthesis, to reverse stuffs.
    // To reverse linked list in constant time use stack.
    // Push - to put data. Pop - to take out data.
}
