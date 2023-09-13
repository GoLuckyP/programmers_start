class Solution {
    public String solution(String my_string) {
        StringBuffer stringBuffer = new StringBuffer(my_string);
        
        String answer = stringBuffer.reverse().toString();
        return answer;
    }
}