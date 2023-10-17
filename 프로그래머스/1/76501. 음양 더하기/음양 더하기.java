import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int minus = 0;
        int plus = 0;
        for(int x = 0; x < absolutes.length; x++){
            if(signs[x] == false){
               minus += absolutes[x]; 
            } //음수의 절대값만 더한 값
            
            if(signs[x] == true){
                plus += absolutes[x];
            }// 양수 절대값만 더한 값
        }
        int answer =  plus - minus;
        return answer;
    }
}