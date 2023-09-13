import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        List<String> list = new ArrayList<String>();
        
        for(int isTall : array){
            if(height < isTall){
                list.add(Integer.toString(isTall));
            }
        }
        int answer = list.size();
        return answer;
    }
}