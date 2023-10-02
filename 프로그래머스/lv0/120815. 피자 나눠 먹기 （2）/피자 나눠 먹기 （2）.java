/*피자 나눠 먹기 (2)*/
class Solution {
    public int solution(int n) {
        //1 ≤ n ≤ 100이기 떄문에 pizzaCount는 1부터 시작
         int pizzaCount = 1;

        /* n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 */
        /* (pizzaCount * 6) % n == 0이어야 한다. */
        while ((pizzaCount * 6) % n != 0) {
            pizzaCount++;
        }

        int answer = pizzaCount;
        return answer;
    }
}
    
    