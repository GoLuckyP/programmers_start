import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] strlist) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(String str : strlist){
            list.add(str.length());
        }
        //List<Integer> list를 int[] 배열로 바꿔준다
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}