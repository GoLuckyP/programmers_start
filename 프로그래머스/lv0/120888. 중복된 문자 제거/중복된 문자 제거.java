import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        //LinkedHashSet은 순서를 보장하고 중복을 허용하지 않는다
            LinkedHashSet<String> set = new LinkedHashSet<String>();
        StringBuilder sb = new StringBuilder();
        String[] myStrArr = my_string.split("");
        
        for(String str : myStrArr){
            //중복일 경우 false이기 때문에 if문이 실행되지 않는다
            if(set.add(str)){
            //StringBuilder sb에 str을 하나씩 추가   
            sb.append(str);          
            }
        }
     return sb.toString();
    }
}    