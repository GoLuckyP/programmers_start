import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, String letter) {
        // 문자열 my_string을 문자 스트림으로 변환
        String answer = my_string.chars()
            // letter 문자열 제거
            .filter(c -> !letter.contains(String.valueOf((char) c)))
            // 각각의 문자들을(c) 문자열로 변경
            .mapToObj(c -> String.valueOf((char) c))
            // 문자열을 연결하여 하나의 문자열로 생성
            .collect(Collectors.joining());
        return answer;
    }
}