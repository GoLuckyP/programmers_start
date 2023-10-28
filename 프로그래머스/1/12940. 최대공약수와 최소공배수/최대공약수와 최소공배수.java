/*최대공약수와 최소공배수 */
import java.math.BigInteger;

class Solution {
    public int[] solution(int n, int m) {
        BigInteger bigInteger1 = new BigInteger(String.valueOf(n));
        BigInteger bigInteger2 = new BigInteger(String.valueOf(m));

        int gcd = Integer.parseInt(String.valueOf(bigInteger1.gcd(bigInteger2))); // 최대 공약수
        int lcm = gcd * (n / gcd) * (m / gcd); // 최소 공배수


        return new int[] {gcd,lcm};
    }
}