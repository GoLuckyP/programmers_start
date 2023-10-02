import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n) {
       
       List<Integer> list = new ArrayList<>();
        // n % i 나눗셈 연산 시 나머지가 0일 경우 i는 약수다 
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
               list.add(i);
            }
        }
        
        //List<Integer> list를 배열로 바꿔준다
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        //오름차순 변환
        Arrays.sort(answer);
        return answer;
    }
}