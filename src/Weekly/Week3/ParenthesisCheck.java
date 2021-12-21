package Weekly.Week3;

import java.util.Stack;

public class ParenthesisCheck {
    public static boolean isBalanced(String string) {
        Stack<Character> stack = new Stack<>();
        char check;

        for (int i = 0; i < string.length(); i++) {
            char bracket = string.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(string.charAt(i));
                continue;
            }
            if (stack.isEmpty()) return false;
            switch (bracket) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[') return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[') return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{') return false;
                }
            }
        }
            return stack.isEmpty();
    }

    public static boolean isBalanced2(String string){
        Stack<Character> stack = new Stack<>();
        String openingBraces = "[{(";
        String closingBraces = "]})";
        for (int i = 0; i < string.length(); i++) {
            char bracket = string.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(string.charAt(i));
                continue;
            }
            int closingBracketIndex = closingBraces.indexOf(bracket);
            char similarOpeningBracket = openingBraces.charAt(closingBracketIndex);
            char poppedBracket = stack.pop();
            if (similarOpeningBracket != poppedBracket) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isBalanced2("(({}))"));
    }
}
