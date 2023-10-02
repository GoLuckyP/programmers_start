import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        // 나머지 연산은 수가 나누는 값보다 작으면 나머지가 그대로 나누는 수가 된다.
        // 나머지 연산을 사용하여 배열의 인덱스가 배열 크기를 넘지 않도록 한다.
        int[] answer = new int[numbers.length];
        for(int n = 0; n < numbers.length; n++){
        // direction은 "left" 또는 "right" 중 하나
            if (direction.equals("right")) {
                // 오른쪽 이동 // 제일 마지막 끝의 인덱스 원소 값은 제일 첫번째 원소 자리로 
                answer[(n + 1) % numbers.length] = numbers[n];
            } else if (direction.equals("left")) {
                // 왼쪽 이동 // 제일 첫번째 인덱스의 원소 값은 제일 끝 원소 자리로 이동
               answer[n] = numbers[(n + 1) % numbers.length];
            }
        }
        
        return answer;
    }
}