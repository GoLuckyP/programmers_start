/*시저암호*/
class Solution {
    public String solution(String s, int n) {
        // 빈 문자열 처리
        if (s == null || s.isEmpty()) {
            return s;
        }

        // 문자열을 문자 배열로 변환
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            //시저 암호를 구현할 때 유니코드는 문자를 숫자로 변환후, 변환된 숫자를 다시 문자로 변환한다
            if (Character.isUpperCase(c)) {
                charArray[i] = (char) ('A' + (c - 'A' + n) % 26);
            }
            else if (Character.isLowerCase(c)) {
                charArray[i] = (char) ('a' + (c - 'a' + n) % 26);
            }
        }

        // 문자 배열을 문자열로 변환하여 반환
        return new String(charArray);
    }
}