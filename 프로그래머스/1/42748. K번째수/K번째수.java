/*k번째 수 */
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
    List<Integer> resultList = new ArrayList<>(); // 연산 결과를 담을 리스트

        for(int[] i :commands){
            int[] copyArr = array.clone();

            // 주어진 배열 array에서 i[0]번째부터 ~ i[1]번째까지 배열을 자른다
            // Arrays.copyOfRange(원본 배열,start, 배열 크기) 사용
            int[] slice = Arrays.copyOfRange(copyArr,i[0] -1,i[1]);
            Arrays.sort(slice); //자른 배열 정렬

            //n번째 원소를 찾기 때문에 -1 해준다
            resultList.add(slice[i[2] - 1]);
        }
        //Integer ArrayList를 int[]배열로 변환
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}