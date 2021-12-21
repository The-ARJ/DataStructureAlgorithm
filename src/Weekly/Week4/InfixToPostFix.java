package Weekly.Week4;

import java.util.Stack;

public class InfixToPostFix {

    private static int precedence(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static String toPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (precedence(c) > 0) {
                while (!characterStack.isEmpty() && precedence(c) <= precedence(characterStack.peek())) {
                    result.append(characterStack.pop());
                }
            } else if (c == '(') characterStack.push(c);
            else if (c == ')') {
                char x = characterStack.pop();
                while (x != '(') {
                    result.append(x);
                    x = characterStack.pop();
                }
            } else {
                result.append(c);
            }
        }
        while (!characterStack.isEmpty()) {
            result.append(characterStack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(InfixToPostFix.toPostfix("K+L-M*N+(O^P)*W/V"));
    }
    // TODO InFix to PostFix || PostFix to InFix || PostFix Eval || InFix to PreFix and vice-versa
}
