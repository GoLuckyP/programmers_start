/*올바른 괄호*/
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c); // '('일 경우 스택에 push
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // 스택에서 '('를 pop
                } else {
                    return false; // ')'를 만나서 짝이 안맞는 경우 false 반환
                }
            }
        }

        return stack.isEmpty();
    }
}