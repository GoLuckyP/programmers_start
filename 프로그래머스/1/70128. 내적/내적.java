/*내적*/
import java.util.*;
//길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. 
//a와 b의 내적 = a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
//a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int[] a, int[] b) {
        int length = a.length;
        int dotProduct = 0;
        for(int i =0; i < length; i++){
            dotProduct += a[i] * b[i];
        }
       
        return dotProduct;
    }
}