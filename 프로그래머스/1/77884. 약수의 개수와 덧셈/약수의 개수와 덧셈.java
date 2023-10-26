/*약수 개수와 덧셈*/
//left ~ right 범위의 숫자들에서
//약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수
class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for(int divisor = left; divisor <=right; divisor++){
            int count = 0; // left의 약수 개수를 카운팅 하는 변수 // 새로운 left를 순회할 때마다 다시 초기화 후 카운팅
            int i = 1; // (0 < a <= d의 제곱근)^2 또한 성립으로 i의 범위(d의 약수 개수를 찾기 위한 탐색 범위)는 1<= i * i <= d이다.
            
            while((i * i) <= divisor){
                
                //divisor % i == 0이 true이면 divisor의 약수
                if(divisor % i == 0){
                    
                    //제곱근일 경우 // 위의 증명에서 (2)번의 경우
                    if (divisor / i == i) {
                        count++;
                    }else{
                        // (1)번의 경우만으로 약수 2개를 알 수 있으므로 약수 개수 +2 카운트
                        count +=2;
                    }
                }
                i++;
            }
            
            //약수 개수가 짝수인 left는 더한다
            //약수의 개수가 짝수인 수는 더하고
            if(count % 2 == 0) {
                result += divisor;

            }else{
                //약수의 개수가 홀수인 left는 뺀다
                //약수의 개수가 홀수인 수는 뺀 수
                result -= divisor;
            }
        }

        return result;
    }
}