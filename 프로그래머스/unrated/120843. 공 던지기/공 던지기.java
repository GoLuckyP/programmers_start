/*공 던지기*/
class Solution {
    public int solution(int[] numbers, int k) {
        int length = numbers.length;
        int lengthBetween = k * 2; // 던진 거리 = 던진 횟수 * 던질 때마다 움직인 거리

        // 만약 던진 거리(lengthBetween)가 배열의 길이(length)보다 크다면,
        // 배열을 한 바퀴 돌아서 시작 지점으로 돌아가야 함
        while(lengthBetween > length){
            lengthBetween = lengthBetween - length; 
        }
        int threw = lengthBetween - 2;
        if(threw < 0){
            threw = length + threw;
            
        }
        
        return numbers[threw]; // k번째로 공을 던지는 사람
    }
}