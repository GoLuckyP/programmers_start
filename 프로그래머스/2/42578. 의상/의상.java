/*의상*/
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {

        // 의상 종류별 의상 가지 수를 저장할 맵
        Map<String, Integer> clothesMap = new HashMap<>();

        // 의상 종류별 가지 수를 계산
        for (String[] cloth : clothes) {
            String clothType = cloth[1];
            clothesMap.put(clothType, clothesMap.getOrDefault(clothType, 0) + 1);
        }

        int totalCombinations = 1;

        // 각 의상 종류를 선택하거나 선택하지 않는 경우를 모두 고려한 조합 계산
        for (int count : clothesMap.values()) {
            totalCombinations *= (count + 1); // 각 의상 종류를 선택하지 않는 경우까지 포함하여 +1
        }

        // 모두 선택하지 않는 경우를 제외
        totalCombinations -= 1;

        return totalCombinations;
    }
}