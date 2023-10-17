/*핸드폰 번호 가리기*/

class Solution {
    public String solution(String phone_number) {
         
        int length = phone_number.length(); //문자열 길이 구함
        
        // 마지막 4자리를 제외한 나머지 부분을 '*'로 채움
        StringBuilder hiddenPart = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            hiddenPart.append("*");
        }
        
        // 마지막 4자리를 추출
        String lastFourDigits = phone_number.substring(length - 4);
        
        // 나머지 부분과 마지막 4자리를 합쳐서 새로운 문자열 생성
        String answer = hiddenPart.toString() + lastFourDigits;
        
        return answer;
    }
}