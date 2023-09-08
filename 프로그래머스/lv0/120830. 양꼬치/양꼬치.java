class Solution {
    public int solution(int n, int k) {
        //서비스로 받은 음료수
        int serviceDrinks = n / 10;   
        //계산 해야 하는 음료수 = 마신 음료수 수 - 서비스로 받은 음료수
        int numDrinksToPay = k - serviceDrinks;
        
        //지불 해야 하는 돈 // (양꼬치 * 12000) + (계산할 음료 * 2000)
        int answer = (n * 12000) + (numDrinksToPay * 2000);
        
        return answer;
    }
}