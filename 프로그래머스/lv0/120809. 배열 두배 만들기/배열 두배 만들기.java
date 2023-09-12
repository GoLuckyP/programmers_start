import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i : numbers){
            
            i = i * 2;
            list.add(i);
        }
        
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}