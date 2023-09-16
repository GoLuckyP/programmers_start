import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        // num1 시작하는 인덱스 
        // num2 종료하는 인덱스
        // Arrays.copyOfRange()는 사직하는 인덱스에서부터 종료하는 인덱스 미만인 원소를 copy한 배열을 만들어주기 때문에 num2 +1를 해준다.
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}