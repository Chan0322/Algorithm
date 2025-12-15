import java.util.*;

class Solution{
    public String solution(String[] participant, String[] completion){
        String answer = "";
        
        // 참가자 명단 저장 (선수 이름이 키, 저장된 횟수가 값)
        HashMap<String, Integer> map = new HashMap<>();
        // 이미 저장된 이름일 경우 +1 (동명이인), 저장되지 않은 이름이면 1
        for(String person : participant) {
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        
        // 완주한 경우 참가자 명단에서 -1
        for(String person : completion) {
            map.put(person, map.get(person) - 1);
        }
        
        // 완주하지 못한 선수 1명 찾기.
        for(String person : map.keySet()){
            if(map.get(person) == 1){
                answer = person;
                break;
            }
        }
        
        return answer;
    }
}