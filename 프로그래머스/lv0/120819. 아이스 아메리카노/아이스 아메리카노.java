class Solution {
    public int[] solution(int money) {
        int iceCoffeeCount = money / 5500;
        int remainder = money % 5500;
        
        int[] answer = {iceCoffeeCount,remainder};
        return answer;
    }
}