/*다리를 지나는 트럭 */
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0; // 경과 시간
        int totalWeight = 0; // 현재 다리 위에 있는 트럭의 총 무게
        Queue<Integer> trucks = new LinkedList<>(); // 대기 중인 트럭들을 큐로 관리

        for (int truck : truck_weights) {
            trucks.offer(truck);
        }

        Queue<Integer> bridge = new LinkedList<>(); // 다리를 나타내는 큐
        Queue<Integer> bridgeTime = new LinkedList<>(); // 각 트럭이 다리에 진입한 시간을 나타내는 큐

        while (!trucks.isEmpty() || !bridge.isEmpty()) {
            time++; // 시간 증가

            if (!bridge.isEmpty() && time - bridgeTime.peek() >= bridge_length) {
                // 다리에서 다리를 나가는 트럭의 무게를 빼고 큐에서 제거
                totalWeight -= bridge.poll();
                bridgeTime.poll();
            }

            if (!trucks.isEmpty() && totalWeight + trucks.peek() <= weight) {
                // 대기 중인 트럭이 다리에 진입할 수 있으면 큐에 추가하고 무게 업데이트
                int truck = trucks.poll();
                bridge.offer(truck);
                bridgeTime.offer(time);
                totalWeight += truck;
            }
        }

        return time;
    }
}








