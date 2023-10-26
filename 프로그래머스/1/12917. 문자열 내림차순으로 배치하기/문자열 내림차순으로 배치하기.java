/*문자열 내림차순으로 배치하기 */
import java.util.*;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split(""); //문자열 배열로 변환
        Arrays.sort(sArr); //변환한 문자열 배열을 오름차순 정렬
        String str = String.join("",sArr); // 정렬된 문자열 배열을 문자열로 다시 변환

        //revers()함수를 쓰기 위해 StringBuilder 객체 생성
        StringBuilder strBuilder = new StringBuilder(str);
        
        // 문자열 뒤집고(내림차순 정렬) 문자열로 다시 형변환
        return strBuilder.reverse().toString();
    }
}