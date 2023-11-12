/*소인수분해 */
import java.util.*;
class Solution {
    public int[] solution(int n){
        HashSet<Integer> set = new HashSet<>();
        // 2부터 n까지의 수에 대해 소인수를 구한다.
        for (int x = 2; x <= n; x++) {
            while (n % x == 0) {
                set.add(x); // x가 n의 소인수인 경우 추가
                n /= x; // n을 x로 나눈다.
            }
        }

        int[] primeFactors = Arrays.stream(set.toArray()).mapToInt(i-> (int) i).toArray();
        Arrays.sort(primeFactors);//오름차순 정렬
        System.out.println(Arrays.toString(primeFactors));
        return primeFactors;
    }
}