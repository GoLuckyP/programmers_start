/*하샤드 수*/
class Solution {
    public boolean solution(int x) {
        // 주어진 숫자의 복사
        int copyX = x;
        // 각 자릿수의 합을 저장할 변수
        int digitSum = 0;
        
        while (copyX > 0) {
            // copyX의 가장 오른쪽 자릿수++
            digitSum += copyX % 10;
            // copyX가 더 이상 나누어지지 않을 때 멈춘다
            copyX /= 10;
        }

        // 주어진 숫자가 각 자릿수의 합으로 나누어지면 하샤드 수입니다.
        return x % digitSum == 0;
    }
}


/*
//         // 숫자 배열의 길이가 짝수일 때 : 숫자 배열의 양끝의 합 * (숫자 배열의 길이 / 2) = 각 자리수의 합이다.  
//         // 숫자 배열의 길이가 홀수인 경우: 마지막 자릿수를 제외한 숫자 배열의 자릿수 합 + 나머지 자릿수 = 각 자리수의 합이다.
        
//         // 주어진 숫자 x를 문자열로 변환 후 각 자릿수를 배열로 분할
//         String[] y = String.valueOf(x).split("");
//         // 각 자릿수의 합을 저장할 변수
//         int digitSum = 0;
//         // 숫자의 자릿수가 짝수인지 확인
//         int hasEven = y.length % 2;
        
//         // 숫자의 자릿수가 짝수일 때
//         if(hasEven == 0){
//             // 자릿수 합 계산
//           digitSum = (Integer.valueOf(y[0])+ Integer.valueOf(y[y.length-1])) * (y.length / 2);
//              return boolean result = x % digitSum == 0 ? true : false; 
//         }else{ // 숫자의 자릿수가 짝수가 아닐 때
//             // 자릿수 합 계산
//             digitSum = (Integer.valueOf(y[0])+ Integer.valueOf(y[y.length-2])) * (y.length / 2) + Integer.valueOf(y[y.length-1]);
//             return boolean result = x % digitSum == 0 ? true : false;
//          }     */