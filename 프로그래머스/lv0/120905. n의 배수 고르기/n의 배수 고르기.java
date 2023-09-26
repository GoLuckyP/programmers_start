import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num : numlist){
            if(num % n == 0){ //num을 n으로 나누었을 때 나머지가 0이면 
                             // num은 n의 배수이다
                list.add(num);
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}