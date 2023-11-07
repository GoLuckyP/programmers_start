/*전화번호 목록*/
import java.util.*;

class Solution {
       public boolean solution(String[] phone_book) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String prefix : phone_book) {
            hashMap.put(prefix, 1);
        } // 접두사를 모두 담는다 

        for (String phNum : phone_book) {
            for (int i = 1; i < phNum.length(); i++) {
                String prefix = phNum.substring(0, i); // hashMap에 담긴 접두사와 일치할 때까지 phNum을 반복하여 접두사를 만든다.(일치가 안 될 수도 있음)
                if (hashMap.containsKey(prefix)) { // prefix와 같은 접두사가 존재하냐?
                    return false;
                }
            }
        }

        return true;
    }
    
}