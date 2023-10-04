class Solution {
    public int solution(int order) {
        String[] strArr = String.valueOf(order).split("");
        int answer = 0;
        
        for(String str : strArr){
            if(str.equals("3") || str.equals("6") || str.equals("9")){
                answer++;
            }
        }
        
        return answer;
    }
}