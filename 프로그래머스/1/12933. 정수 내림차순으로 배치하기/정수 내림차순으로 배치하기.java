/*정수 내림차순으로 배치하기*/
/*카운팅정렬*/
class Solution {
    public long solution(long n) {
        // 각 자릿수의 빈도를 저장할 배열
        int[] digitFrequency = new int[10];
        
        // 숫자의 각 자릿수를 추출하고 빈도를 세기
        while (n > 0) {
            //뒤에서부터 각 자릿수를 추출
            int digit = (int)(n % 10);
            digitFrequency[digit]++;
            n /= 10;
        }
        
        // 가장 큰 자릿수부터 시작하여 새로운 숫자를 생성
        long result = 0;
        //내림차순으로 정렬
        for (int digit = 9; digit >= 0; digit--) {
            while (digitFrequency[digit] > 0) {
                result = result * 10 + digit;
                digitFrequency[digit]--;
            }
        }
        
        return result;
    }
}