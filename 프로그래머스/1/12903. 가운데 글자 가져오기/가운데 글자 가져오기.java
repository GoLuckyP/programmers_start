/*가운데 글자 가져오기 */
import java.util.*;

class Solution {
    public String solution(String s) {
        int length = s.length();
        String[] sArr = s.split("");
        
        // 문자열 s 길이가 짝수일 때
        if(length % 2 == 0){
            String str = sArr[length/2-1] + sArr[length/2];
           return str;          
        }
        // 문자열 s 길이가 홀수일 때
        return sArr[length/2];
    }
}