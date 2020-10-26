package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        //return false; // place holder
        if (str == null || str.length() == 0) {
            return false;
        }
        ArrayStack<Character> stack = new ArrayStack<Character>(7);
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && stack.size() < 0 && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
