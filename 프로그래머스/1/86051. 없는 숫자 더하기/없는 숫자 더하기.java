/*없는 숫자 더하기*/
import java.util.*;


//1.int[] numbers은 0부터 9까지의 숫자 중 일부가 들어있다
class Solution {
    public int solution(int[] numbers) {
        
        int[] all = {0,1,2,3,4,5,6,7,8,9};
        int allSum = (all[0]+all[all.length-1])*(all.length/2); // 0부터 9까지 범위의 숫자 합
        
        int numbersSum = 0; // numbers의 요소 합을 담는 변수

            for(int num = 0; num < numbers.length; num++){
                numbersSum += numbers[num];
            }
        
        int answer = allSum - numbersSum;
        
        return answer;
        
    }
        
}