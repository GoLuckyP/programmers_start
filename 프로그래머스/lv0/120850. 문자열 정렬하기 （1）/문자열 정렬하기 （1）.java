import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
    
        return my_string.chars() // IntStream으로 변환
            .filter(Character::isDigit) // 숫자가 아닌 문자 필터링
            .map(Character::getNumericValue) // map 메서드를 사용하여 숫자 문자를 숫자로 변환 
            .sorted() // 오름차순 정렬
            .toArray(); // 배열로 변환
    }
}