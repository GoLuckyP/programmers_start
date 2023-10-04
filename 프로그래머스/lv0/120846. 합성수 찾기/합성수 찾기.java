// 에라토스테네스의 체 알고리즘을 이용

class Solution {
    public int solution(int n) {
        int count = 0; // 약수의 개수를 세는 변수
        int answer =0;    
        for (int i = 1; i <= n; i++) {
            count = 0; // 각 숫자마다 약수의 개수를 초기화

            for (int x = 1; x <= i; x++) {
                if (i % x == 0) {
                    count++;
                }
            }

            if (count > 2) {
                // 약수의 개수가 2보다 크면 합성수로 판별
                count = 0;
                answer++;
            }
        }

        return answer;
    }
}
/*
class Solution {
    public int solution(int n) {
        boolean[] isComposite = new boolean[n + 1]; // 인덱스 0은 사용하지 않음
        
        for (int number = 2; number <= n; number++) {
            if (!isComposite[number]) { // 소수인 경우
                for (int multiple = number * 2; multiple <= n; multiple += number) {
                    isComposite[multiple] = true; // 소수의 배수는 합성수
                }
            }
        }
        
        int count = 0;
        for (int i = 4; i <= n; i++) { // 4부터 합성수
            if (isComposite[i]) {
                count++;
            }
        }
        
        return count;
    }
}
*/