/*더 맵게 */

import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
       int count = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

        for(int i : scoville){
           minHeap.offer(i); //지정된 요소를 삽입
        }

        while(minHeap.size() > 1){
            //가장 맵지 않은 음색의 스코빌 지수
            int first = minHeap.poll();
            if(first >= K){
                // 모든 음식의 스코빌 지수가 K이상이 되었으면 반복 종료
                break;
            }
            //두 번째로 맵지 않은 음식의 스코빌 지수
            int second = minHeap.poll();
            //새로운 음식의 스코빌 지수 계산 후 우선 순위 큐에 추가
            int newScoville = first +(second * 2);
            minHeap.offer(newScoville);

            count++; //섞은 횟수 증가
        }
        if(minHeap.peek() < K){
            return -1; //모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return
        }

        // 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return
        return count;
    }
}