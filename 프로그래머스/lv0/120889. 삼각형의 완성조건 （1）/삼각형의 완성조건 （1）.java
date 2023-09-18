import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // Arrays.sort() 메소드를 이용해 배열 sides 원소를 오름차순 정렬한다
        Arrays.sort(sides);
        
        //따라서  sides[sides.length-1]은 최대 값 (가장 긴 변의 길이)
        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작으면 삼각형으로 만들 수 있다.
        if(sides[sides.length-1] < sides[0] +sides[1]){
          answer = 1;  
        } else{
            
          //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작지 않으면 삼각형으로 만들 수 없다.  
          answer = 2;
        }
        
        return answer;
    }
}