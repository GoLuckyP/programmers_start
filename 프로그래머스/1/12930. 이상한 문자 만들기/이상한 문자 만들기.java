/*이상한 문자 만들기 */
import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuffer strBuffer = new StringBuffer();
        
        int index = 0; // 단어의 인덱스를 나타내는 변수

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                index = 0; // 공백 문자일 경우 단어 인덱스 초기화
                strBuffer.append(c); // 공백 문자는 그대로 추가
                
            } else {
                // 홀수번째 알파벳은 소문자, 짝수번째 알파벳은 대문자로 변경하여 추가
                if (index % 2 == 0) {
                    strBuffer.append(Character.toUpperCase(c));
                } else {
                    strBuffer.append(Character.toLowerCase(c));
                }
                index++;
            }
        }

        return strBuffer.toString();
    }
}