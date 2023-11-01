import java.util.*;
import java.util.List;
class Solution {
    public int solution(int[] number) {
        
        int answer = 0;
        int n = number.length;

        for (int i = 1; i < (1 << n); i++) {
            int sum = 0;
            List<Integer> selectedStudents = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    sum += number[j];
                    selectedStudents.add(j);
                }
            }

            if (sum == 0 && selectedStudents.size() == 3) {
                answer++;
            }
        }

        return answer;
    }
}