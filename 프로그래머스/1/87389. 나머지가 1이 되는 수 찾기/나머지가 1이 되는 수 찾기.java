class Solution {
    public int solution(int n) {
        int answer = 0;
       // 1로 나누면 어떤 숫자든 나머지는 무조건 0이므로, 2부터 시작
        for(int i = 2; i< n+1; i++){
            // (n-1) % i 가 0일 때 n을 i로 나눈 나머지가 1이 되도록하는 자연수
            if((n-1) % i == 0){
                answer = i;
                break; //첫 번째로 나머지가 0이 되는 i를 찾기 위해 반복문을 종료 
            }
        }
        
        return answer;
    }
}