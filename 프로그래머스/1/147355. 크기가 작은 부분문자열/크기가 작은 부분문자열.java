/*크기가 작은 부분문자열 */
class Solution {
    public int solution(String t, String p) {
      int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int count = 0;
        
        for (int i = 0; i < length; i++) {
            //strartIdx ~ startIdx + p의 길이까지
            String temp = t.substring(i, i + p.length());   
            
            if (Long.parseLong(temp) <= pNum) {
            	count++;
            }
            
        }
        return count;   
    }
}