class Solution {
    public int solution(int num, int k) {
        String[] numStrArr = String.valueOf(num).split("");
        String kStr = String.valueOf(k);
        int index = 0;
        int answer = 0;
        
        for(String n : numStrArr){
            
            if(n.equals(kStr)){
                //인덱스는 0부터 시작하므로 +1을 해준다
                answer = index + 1;//k의 자리수
            }else{
                index++;
            }
        }
        //num 자리수에 k가 없으면 -1을 리턴한다
        if(answer == 0 ){
            answer = -1;
        }
        return answer;
    }
}