// 한 번만 등장한 문자

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
 // key = 문자, value = 개수를 담기 위한 객체
        Map<Character,Integer> map = new HashMap<>();

        // 문자열을 만들기 위해 StringBuilder 생성
        StringBuilder stringBuilder = new StringBuilder();

        // 원래 주어진 문자열 s를 순회하면서 문자 개수 카운트
        for(char c : s.toCharArray()){
           if(map.containsKey(c)){
               map.put(c,map.get(c) + 1);
           }else{
               map.put(c,1);
           }
        }

        // 문자 개수가 1개인 경우만 문자열 객체에 넣어준다
        for(Character character : map.keySet()){
            if(map.get(character) == 1){
                stringBuilder.append(character);
            }
        }

        // stringBuilder를 char[] 타입으로 형변환 후 오름차순 정렬
        char[] chars = stringBuilder.toString().toCharArray();
        Arrays.sort(chars);
        // String 타입으로 형변환 하여 반환
        return new String(chars);
    }
}