/*팩토리얼*/
class Solution {
    public int solution(int n) {
    int result = 1;
    int maxI = 0;    
    for (int i = 1; i <= n; i++) {
        result *= i;
        if(result >= n){
            if(result > n){
                return i-1;
            }
            return i;
        }
    }
        return 0;
} 
}