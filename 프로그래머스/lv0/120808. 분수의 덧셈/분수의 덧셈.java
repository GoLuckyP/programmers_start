class Solution {
    // 최대공약수를 계산하는 함수
    private int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분모의 최소 공배수를 계산
        int lcm = (denom1 * denom2) / calculateGCD(denom1, denom2);

        // 각 분자를 공통 분모에 맞게 확장
        int extendedNumer1 = numer1 * (lcm / denom1);
        int extendedNumer2 = numer2 * (lcm / denom2);

        // 분자를 더함
        int sumNumer = extendedNumer1 + extendedNumer2;

        // 결과 분자와 분모의 최대공약수를 계산
        int gcd = calculateGCD(sumNumer, lcm);

        // 기약 분수로 나타내기 위해 분자와 분모를 최대공약수로 나눔
        int reducedNumer = sumNumer / gcd;
        int reducedDenom = lcm / gcd;

        int[] answer = {reducedNumer, reducedDenom};
        return answer;
    }
}
