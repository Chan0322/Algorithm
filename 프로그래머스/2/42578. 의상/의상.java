import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        // 종류별 의상 개수 (키는 종류, 개수는 값)
        Map<String, Integer> cnts = new HashMap<>();
        
        // 2차원 배열을 돌며 의상 종류별 개수 저장
        for(String[] cloth : clothes){
            String type = cloth[1]; // 종류 확인
            
            // 일치하는 종류 개수 + 1
            cnts.put(type, cnts.getOrDefault(type, 0) + 1);
        }
        
        // 모든 경우의 수
        int total = 1;
        // 종류별 개수 확인
        for(int cnt : cnts.values()){
            // 개수 중 한가지를 선택 또는 선택하지 않음(1)
            total *= (cnt + 1);
        }
        
        // 아무것도 입지 않은 경우 제외
        answer = total - 1;
        
        return answer;
    }
}