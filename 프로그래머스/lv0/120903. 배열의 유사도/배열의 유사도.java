import java.util.*;
// import java.util.stream.collectors;


class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        for(String str : s2){
            boolean sameValue = Arrays.stream(s1).anyMatch(str::equals);
            if(sameValue){
                count ++;
            }
        }
        
        int answer = count;
        return answer;
    }
}