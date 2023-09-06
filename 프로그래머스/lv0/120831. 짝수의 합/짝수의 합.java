class Solution {
    public int solution(int n) {
         int sum = 0;
        int answer = 0;
        
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        
        answer = sum;
        return answer;
    }
}