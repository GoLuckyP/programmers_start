/*두 정수 사이의 합*/
/*산술 합계 공식 = * (시작값 + 끝값) * 항의 개수 / 2*/
class Solution {
    public long solution(int a, int b) {
        // a와 b 중에서 작은 수를 start로 선택
        long start = Math.min(a, b);
        // a와 b 중에서 큰 수를 end로 선택
        long end = Math.max(a, b);
        // start부터 end까지의 연속된 정수 합을 구함
        long sum = (start + end) * (end - start + 1) / 2;
        return sum;
    }
}