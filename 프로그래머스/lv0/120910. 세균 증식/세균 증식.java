import java.lang.Math;

class Solution {
    public int solution(int n, int t) {
        //n은 1시간에 n*2가 된다
        // n = n * 2의 t제곱
        int answer = n * (int)Math.pow(2, t); //2점 이상 나오신 분...알려주세요
        return answer;
    }
}