/*진료 순서 정하기*/

import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
    int n = emergency.length;
    int[] result = new int[n];

    // 중요도 배열을 내림차순으로 정렬한 인덱스를 저장하는 배열 생성
    Integer[] sortedIndices = new Integer[n];
    for (int i = 0; i < n; i++) {
        sortedIndices[i] = i;
    }
    // 중요도의 순서대로 나열한 element의 기존 위치값을 배열 sortedIndices에 저장 
    Arrays.sort(sortedIndices, (a, b) -> Integer.compare(emergency[b], emergency[a])); 
    // 배열 result의 index(중요도의 순서대로 나열한 element의 기존 위치값)위치에 중요도 순서값을 저장
    for (int i = 0; i < n; i++) {
        result[sortedIndices[i]] = i + 1;
    }

    return result;
    }

}