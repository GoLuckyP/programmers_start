import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] array) {
        // 내림차순 정렬하기 위해 Integer[] 배열로 변환
        Integer[] arrayInteger = Arrays.stream(array).boxed().toArray(Integer[]::new);
        // 내림차순 정렬
        Arrays.sort(arrayInteger,Collections.reverseOrder()); 
        
        // int[] 배열로 다시 변환
        array = Arrays.stream(arrayInteger).mapToInt(i->i).toArray();
        
        // 홀수 길이의 배열에서 중간 원소를 찾기 위해 배열의 길이를 2로 나눈 결과는 중앙값의 인덱스와 동일하다
        // 배열은 인덱스가 0부터 시작하기 때문
        int answer = array[array.length/2]; 
        return answer;
    }
}