/*프로세스 */
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
       Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 사용

        // 큐에 대기 중인 프로세스의 우선순위를 저장
        for (int priority : priorities) {
            queue.offer(priority);
            priorityQueue.offer(priority);
        }

        int order = 0; // 몇 번째로 실행되는지를 나타내는 변수

        while (!queue.isEmpty()) {
            int currentPriority = queue.poll(); // 현재 프로세스의 우선순위를 가져옴

            // 현재 프로세스의 우선순위가 가장 높은 우선순위와 같으면 인쇄
            if (currentPriority == priorityQueue.peek()) {
                order++; 
                priorityQueue.poll(); 

                if (location == 0) {
                    return order; 
                } else {
                    location--; 
                }
            } else {
                queue.offer(currentPriority); 
                if (location == 0) {
                    location = queue.size() - 1; 
                } else {
                    location--; 
                }
            }
        }

        return order;
    }
}