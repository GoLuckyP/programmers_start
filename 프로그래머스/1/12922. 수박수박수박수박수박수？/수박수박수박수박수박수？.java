/*수박수박수박수박수박수?*/

class Solution {
    //n은 십진법
    public String solution(int n) {
  
         StringBuilder result = new StringBuilder();

        // n 짝수일 떄
        for (int i = 0; i < n / 2; i++) {
            result.append("수박");
        }
        // n이 짝수가 아닌 홀수라면 "수"를 한 번 더 추가
        if (n % 2 != 0) {
            result.append("수");
        }

        return result.toString();
    }
}