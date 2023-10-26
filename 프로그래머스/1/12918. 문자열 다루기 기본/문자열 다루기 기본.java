/*문자열 다루기 기본*/
class Solution {
    public boolean solution(String s) {
       try{
            
        Integer.valueOf(s); //컴파일 오류가 나면 catch로 빠져 false 반환
        
        return (s.length() == 4 || s.length() == 6) ? true : false;
       
       }catch(Exception e){
           return false;
       }
        
        
    }
}