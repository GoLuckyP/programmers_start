import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArr = my_string.toCharArray();
        char temp = charArr[num1]; // charArr[num1] 값을 임시로 저장
        
        charArr[num1] = charArr[num2];
        charArr[num2] = temp;
        
        String answer = new String(charArr); //char[] charArr을 String으로 변환
        return answer;
    }
}