class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
           sum += numbers[i]; 
        }
        double answer = (double) sum / numbers.length; //소수 부분을 포함하도록 double 형변환
        return answer;
    }
}