/*숫자 문자열과 영단어 */
class Solution {
    public int solution(String s) {
        String[] strArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        s = s.toLowerCase(); // 문자열 s에 대문자가 들어올 경우를 고려하여 모두 소문자로 바꿔준다

        // 1. 순회한 문자열 s에서 strArr의 원소 값이 같으면, 그 원소의 index로 문자열을 치환
        for(int i = 0; i < strArr.length; i++) s = s.replace(strArr[i], String.valueOf(i));

        // 2. 1의 치환된 문자열 s를 정수형으로 파싱 되어 int 자료형으로 반환
        return Integer.parseInt(s);
    }
}