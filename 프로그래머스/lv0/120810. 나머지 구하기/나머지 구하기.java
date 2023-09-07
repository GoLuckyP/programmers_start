/**
2. 나머지 구하기
정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    0 < num1 ≤ 100
    0 < num2 ≤ 100
*/

class Solution {
    public int solution(int num1, int num2) {
        int answer = -1; 
        //num1를 num2로 나눈 나머지 값을 담는 변수 
        //주어진 제한 사항을 만족하지 않는 경우 -1이 그대로 반환된다.
        // -1은 일반적으로 값을 찾을 수 없음 또는 유효하지 않음을 나타내는 특별한 값으로 사용된다
        
        if (0 < num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
            answer = num1 % num2; //나눗셈의 나머지를 구하는 연산은 %로 한다
        }
        
        return answer;
    }
}