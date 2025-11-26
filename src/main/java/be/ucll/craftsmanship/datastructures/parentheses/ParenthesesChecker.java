package be.ucll.craftsmanship.datastructures.parentheses;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//A bracket is considered to be any of the following characters – “(“, “)”, “[“, “]”, “{“, “}”.
//A set of brackets is considered to be a matched pair
// if an opening bracket, “(“, “[“, and “{“, occurs to the left of the corresponding closing bracket, “)”, “]”,  and “}”, respectively.
//
//However, a string containing bracket pairs is not balanced if the set of brackets it encloses is not matched.
//Similarly, a string containing non-bracket characters like a-z, A-Z, 0-9 or other special characters like #,$,@ is also considered to be unbalanced.
//
// alternate solution hint: Deque<T> can be used as a stack or queue

public class ParenthesesChecker {

    private static final Set<Character> allowedCharacters =
        new HashSet<>(Arrays.asList('{', '[', '(', '}', ']', ')'));

    static boolean isBalanced(String textToCheck){

        if (textToCheck == null || textToCheck.isEmpty()) 
            return true;

        if (textToCheck.length()%2 != 0) 
            return false;

        Stack<Character> stack = new Stack<>();

        for (char ch: textToCheck.toCharArray()) {
            if (!allowedCharacters.contains(ch)) {
                return false;
            }

            switch (ch) {
                case '(': stack.push(')'); break;
                case '{': stack.push('}'); break;
                case '[': stack.push(']'); break;
                default:
                    if (stack.isEmpty() || stack.pop() != ch) {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
}
