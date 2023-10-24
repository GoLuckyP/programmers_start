/*제일 작은 수 제거하기*/
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) { //length가 1일 경우 가장 작은 수를 제거하면 남는 요소가 없으므로 빈 배열
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();// 가장 작은 수 찾기
        return Arrays.stream(arr).filter(x -> x != min).toArray(); //filter로 작은 수 제거 후 새로운 int[] 생성
    }
}
