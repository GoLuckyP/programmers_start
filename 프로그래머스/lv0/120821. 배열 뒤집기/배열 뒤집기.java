import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int[] solution(int[] num_list) {
        
        //배열을 ArrayList<Integr> List로 변환해준다.
        List<Integer> list = Arrays.stream(num_list).boxed()
                            .collect(Collectors.toList()); 
        //원소를 거꾸로 뒤집어준다.
        Collections.reverse(list);
        
        //int[] 배열로 다시 바꿔준다.
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}