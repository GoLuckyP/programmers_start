class Solution {
    public int solution(int n) {
        int answer = 0;
        // n의 각 자릿수를 더한다
        while (n > 0) {
            answer += n % 10; // n을 10으로 나눈 나머지를 더한다
            n /= 10; // n을 10으로 나눈 몫을 다음 자릿수로 처리
        }
        
        return answer;
    }
}