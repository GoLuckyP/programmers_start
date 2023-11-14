/*주식 가격 */
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
       int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length - 1 - index;
        }
        // 가격이 떨어지지 않은 기간(초단위)이 담긴 배열
        return answer;
    }
}