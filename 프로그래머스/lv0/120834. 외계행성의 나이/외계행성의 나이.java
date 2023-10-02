/*외계행성의 나이*/

import java.util.Arrays;
class Solution {
    public String solution(int age) {
        // 나이를 char[] 형태로 형변환
        char[] ageChar = Integer.toString(age).toCharArray();
        // 외계 행성 나이에 해당하는 문자 배열
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'}; 
        
        // 문자열을 만들기 위해 StringBuilder 객체 생성
        StringBuilder strBuilder = new StringBuilder(); 
        
        // 나이를 외계 행성 나이 표현으로 변환
        for(char ch : ageChar){
            //int age를 char[]로 만든 각각의 원소를 인덱스로 쓰기 위해 int 형변환
            int num = Character.getNumericValue(ch); 
            // 외계 행성 나이에 해당하는 문자 배열 arr[num]
            // 외계 행성 나이 표현을 StringBuilder에 추가
            strBuilder.append(arr[num]); 
        }   
        return strBuilder.toString();
    }
}