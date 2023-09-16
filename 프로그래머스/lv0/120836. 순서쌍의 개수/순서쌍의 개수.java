import java.util.*;

class Solution {
    public int solution(int n) {
        //1. 1<= n<= 1000000
        //2. n = a * b;
        int orderedPairCount = 0; // 순서쌍의 개수
        boolean isDivisor  = false; // i가 n의 약수인지 알려주는 boolean 변수
        
        for(int i = 1; i <= n; i++){
             isDivisor = (n % i == 0); 
            if(isDivisor){
                orderedPairCount++;  // 약수의 개수만큼 count를 함
                                    //약수의 개수는 순서쌍의 수와 일치한다
                }
            }
         
        int answer = orderedPairCount;
        return answer;
    }
}