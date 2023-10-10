import java.util.*;

public class Solution {
    public int solution(int n) {
        // 문자열로 바꿔 split("") 사용해 String[]으로 바꿔준다.
        // 숫자 n의 각각의 자릿수를 원소로 한 배열 String[] arr를 생성
        String nStr = String.valueOf(n);
        String[] arr = nStr.split("");
        
        //문자열로 바뀐 각 자릿수를 Integer로 바꾼 후 int[] 배열에 넣는다
        int[] intArr = new int[arr.length];
        
        
        for(int i =0; i < arr.length;i++){
            intArr[i] = Integer.valueOf(arr[i]);
            
        }
        //각 자릿수의 합
        int answer = Arrays.stream(intArr).sum();;

        return answer;
    }
}