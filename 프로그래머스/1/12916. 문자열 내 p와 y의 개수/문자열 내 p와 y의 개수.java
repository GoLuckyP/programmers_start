class Solution {
    boolean solution(String s) {
        int pCount = 0; // p 개수 카운트
        int yCount = 0; // y 개수 카운트
        
        String[] strArr = s.split(""); //문자열 s를 문자열 배열로 바꿔줌
        
        for(String str : strArr){ // 반복문으로 p와 y를 찾기
            if(str.equals("p") || str.equals("P")){
                pCount++; // p 개수 카운트
            }else if(str.equals("y") || str.equals("Y")){
                yCount++; // y 개수 카운트
            }
        }

        return pCount == yCount ? true : false;
        // pCount == yCount; 이렇게만 해도 됨...
    }
}

/*
class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
*/