import java.util.Arrays;
class Solution {
    public String solution(int age) {
        
        char[] ageChar = Integer.toString(age).toCharArray();//나이를 char[] 형태로 형변환
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'}; 
        
        StringBuilder strBuilder = new StringBuilder(); //문자열로 만들기 위해 생성
        
        for(char ch : ageChar){
            int num = Character.getNumericValue(ch); //arr 배열의 인덱스
            strBuilder.append(arr[num]); 
        }
        
       
        return strBuilder.toString();
    }
}