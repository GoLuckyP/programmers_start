class Solution {
    public int solution(int n) {
        int pizzaCount = n / 7;
        
        if(n % 7 !=0){
        pizzaCount =  pizzaCount + 1;   
        }
        
        int answer = pizzaCount;
        return answer;
    }
}