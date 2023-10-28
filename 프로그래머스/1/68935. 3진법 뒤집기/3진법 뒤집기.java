class Solution {
    public int solution(int n) {
        String reminder = ""; // 나머지를 저장할 문자열
        
        //(1) n을 3진법으로 바꾸는 방법은 숫자 n을 몫이 0이 될 때까지 3으로 나눈 후 나머지를 역순대로 나열하면 3진법이다.
        // 그러나 reminder에 담긴 숫자는 순서대로 나열했으므로 이미 뒤집어져 있는 상태이다. 따로 뒤집을 필요 없음!
        while (n > 0) {
            reminder += String.valueOf(n % 3);
            n /= 3; // n의 몫이 0이 될 때까지 3으로 나눈다.
        }
        
        // 이미 뒤집어진 상태이기 때문에 그대로 10진법으로 다시 바꿔 반환
        int result = 0;
        int exponent = reminder.length() - 1;
        
        for (int i = 0; i < reminder.length(); i++) {
            int digit = Character.getNumericValue(reminder.charAt(i)); // 현재 자릿수의 숫자를 가져옴
            result += digit * Math.pow(3, exponent); // 10진법으로 변환하여 더함
            exponent--; // 다음 자릿수로 이동
        }
        
        return result;
    }
}
