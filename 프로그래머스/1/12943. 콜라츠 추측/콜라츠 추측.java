class Solution {
    public int solution(int num) {
        long n = (long) num; //오버플로우 방지
        int count = 0;
        if(n == 1){
            return 0;
        }
        while (count < 500) { // count가 500 미만인 동안 반복
            if (n == 1) {
                return count;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            
            count++;
        }
        
        return -1;
    }
}