/*구슬을 나누는 경우의 수 7점*/
import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
         // 조합 공식 nCr = n! / (n-r)!r!
        BigInteger nFactorial  = factorial(BigInteger.valueOf(balls));
        BigInteger rFactorial = factorial(BigInteger.valueOf(share));
        BigInteger kFactorial = factorial(BigInteger.valueOf(balls-share));
        
        return nFactorial.divide(kFactorial.multiply(rFactorial)).intValue();
    }

    public static BigInteger factorial(BigInteger num){

        if(num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)){
            return BigInteger.ONE;
            }else{
            return num.multiply(factorial(num.subtract(BigInteger.ONE)));
            }
    }
}