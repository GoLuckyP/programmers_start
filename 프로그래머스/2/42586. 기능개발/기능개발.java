/*기능개발*/

import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
         Queue<Integer> queue = new LinkedList<>();  // 배포까지 남은 일 수를 저장하는 큐
        List<Integer> answerList = new ArrayList<>();  // 각 배포마다 배포되는 기능 수를 저장하는 리스트

        // 각 작업의 배포일 계산 및 큐에 추가
        for (int i = 0; i < progresses.length; i++) {
            int remainingProgress = 100 - progresses[i]; // 남은 진도 계산
            // 배포까지 걸리는 일 수 계산
            int daysToDeploy = (remainingProgress % speeds[i] == 0) ? remainingProgress / speeds[i] : remainingProgress / speeds[i] + 1;
            queue.offer(daysToDeploy); // 큐에 배포일을 추가
        }

        while (!queue.isEmpty()) {
            int dayToDeploy = queue.poll(); // 큐에서 배포일을 꺼냄
            int count = 1; // 현재 배포에 포함될 기능 수를 1로 초기화

            // 다음 작업들 중에서 배포일이 현재 배포일보다 작거나 같은 것을 모두 세기
            while (!queue.isEmpty() && dayToDeploy >= queue.peek()) {
                queue.poll();
                count++;
            }

            answerList.add(count); // 현재 배포에 포함된 기능 수를 리스트에 추가
        }

        // List를 int 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
