import java.math.BigInteger;
/*정수 제곱근 판별*/
/*이진탐색을 이용해 풀이*/
class Solution {
    public long solution(long n) {
        if (n <= 1) {
            return (n + 1) * (n + 1); // n이 0 또는 1인 경우, n이 제곱근이기 때문
        }

        BigInteger num = BigInteger.valueOf(n);
        BigInteger left = BigInteger.ONE;
        BigInteger right = num;

        while (left.compareTo(right) <= 0) {
            BigInteger mid = left.add(right).divide(BigInteger.valueOf(2)); // 중간 값 계산
            BigInteger midSquared = mid.multiply(mid); // 중간 값의 제곱

            if (midSquared.equals(num)) {
                // n이 x의 제곱인 경우, (x+1)의 제곱 반환
                BigInteger result = mid.add(BigInteger.ONE).multiply(mid.add(BigInteger.ONE));
                if (result.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    return result.longValue();
                }
            } else if (midSquared.compareTo(num) < 0) {
                left = mid.add(BigInteger.ONE); // mid가 x보다 작은 경우, 오른쪽 부분 배열에서 탐색
            } else {
                right = mid.subtract(BigInteger.ONE); // mid가 x보다 큰 경우, 왼쪽 부분 배열에서 탐색
            }
        }

        return -1; // 양의 정수 x의 제곱이 아닌 경우 -1 반환
        
}}

/*
class Solution {
    public long solution(long n) {
        long result = -1;
        
        for(long i = 1; i < n; i++){
            if(n % i == 0 &&  (n / i) == i){ //제곱근 찾기
             result = (i+1) * (i+1); // 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴   
            }
        }
        return result;
    }
}
*/