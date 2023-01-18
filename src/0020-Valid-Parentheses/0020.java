public class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '(' && c != ')') {
                    return false;
                } else if (stack.peek() == '[' && c != ']') {
                    return false;
                } else if (stack.peek() == '{' && c != '}') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }
}
