/*나누어떨어지는 숫자 배열*/
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;

        // divisor로 나누어 떨어지는 element만 골라내어 새로운 배열에 저장
        for (int i : arr) {
            if (i % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            // divisor로 나누어 떨어지는 element가 없는 경우
            return new int[]{-1};
        }

        int[] answer = new int[count];
        int idx = 0;

        for (int i : arr) {
            if (i % divisor == 0) {
                answer[idx++] = i;
            }
        }

        // divisor로 나누어 떨어지는 element가 있는 경우, 배열을 오름차순으로 정렬
        Arrays.sort(answer);
        return answer;
    }
}