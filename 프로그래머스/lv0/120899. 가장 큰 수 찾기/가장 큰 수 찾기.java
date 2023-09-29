import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, array.length);

        Arrays.sort(copyArray);
        
        int idx = Arrays.stream(array)
            .boxed() // int 배열을 Integer 스트림으로 변환
            .collect(Collectors.toList())
            .indexOf(copyArray[copyArray.length-1]);
        
        int[] answer = {copyArray[copyArray.length-1],idx};
        return answer;
    }
}