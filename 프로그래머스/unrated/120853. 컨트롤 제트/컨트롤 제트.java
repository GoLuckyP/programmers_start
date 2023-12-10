/*컨트롤제트*/

import java.util.Arrays;

class Solution {
    public int solution(String s) {
        String[] strings= s.split(" "); //문자열을 문자열배열로 변환
        int result = 0;
        int value = 0;
        for(String str : strings){
            // z일 때 그 전 숫자를 뺀다
            if(str.equals("Z")){
                result -= value;
            } else if (str.equals(" ")) {
                continue;
            } else{
                value = Integer.parseInt(str);
                result += value;
            }
        }
        return result;
    }
}