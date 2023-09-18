class Solution {
    public int solution(int slice, int n) {
        // n명이 피자를 먹을 때 필요한 최소한의 피자 개수 계산
        // 각 사람은 최소 1조각 이상 먹어야 함
        // 따라서 필요한 피자 개수는 (n / slice) 몫 + 1(나머지 조각을 위한 추가 피자)
        
        int pizzaCount = n / slice; // 정수 나눗셈으로 몫 계산
        
        // 만약 나머지가 있으면 추가 피자 1개 필요
        if (n % slice > 0) {
            pizzaCount += 1;
        }
        
        // 최소한의 피자 개수 반환
        return pizzaCount;
    }
}