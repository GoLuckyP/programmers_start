/*완주하지 못한 선수*/
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
            // 마라톤 참가자 선수 이름이 담긴 배열 participant
        // 마라톤 완주한 선수 이름 completion
        // 마라톤을 완주하지 못한 선수 이름을 구하시오(한 명만 완주 못 함)
        String incompleted = "";
        // Map<이름,동일인 횟수> // 예시 : a이름이 2명인 사람이 있다면 a,2이다.
        Map<String,Integer> participantMap = new HashMap<>(); // 참가자 명단을 저장할 Map
        Map<String,Integer> completionMap = new HashMap<>(); // 완주자 명단을 저장할 Map

        // participant과 completion을 map<name,count>로 바꿔준다
        for(String name :participant){
            int count = 0;

            if(participantMap.get(name) != null) {
              count = participantMap.get(name) + 1;
            } else{
               count = 1;
            }
            participantMap.put(name,count);
        }

        for(String name : completion){
            int count = 0;

            if( completionMap.get(name) != null) {
                count =  completionMap.get(name) + 1;
            } else{
                count = 1;
            }
            completionMap.put(name,count);
        }

        // 완주하지 못한 선수 찾기 (참가자 명단 - 완주자 명단)
        participantMap.entrySet().removeAll(completionMap.entrySet());
        for(String key : participantMap.keySet()){
            incompleted = key;
            break; // 한 명만 완주 못한 선수이므로 찾으면 종료
        }
        return incompleted;

    }
}