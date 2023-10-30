/* 예산 */
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        // 최대한 많은 부서의 물품을 구매 해야 함!!! 
        
        // 오름차순 정렬 // 작은 값부터 정렬
        Arrays.sort(d);
        
        int idx = 0;
        
        // 예산이 남아 있는 동안 계속 부서에 예산을 할당
        while (budget >= 0 && idx < d.length) {
            budget -= d[idx];
            idx++;
        }
        
        // 예산을 초과하지 않는 부서 개수
        if (budget >= 0) {
            return idx;
        } else {
            return idx - 1;
        }
    }
}