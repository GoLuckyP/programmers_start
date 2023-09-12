import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        
  List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        
        for(int i : num_list){
            int remainder = i % 2; 
            if(remainder != 0){
                oddList.add(i); //홀수만 담는 List
            }else{
                evenList.add(i); //짝수만 담는 List
            }
        }
        
        int oddNumCount = oddList.size(); //홀수 갯수
        int evenNumCount = evenList.size();//짝수 개수
        
        int[] answer = {evenNumCount,oddNumCount};
    
        return answer;
    }
}