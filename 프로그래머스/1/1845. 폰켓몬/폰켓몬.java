import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 선택 가능한 최대 수
        int select = nums.length/2;
        
        // 중복 없이 존재하는 포켓몬의 수를 저장
        Set<Integer> oriPoketmon = new HashSet<>();
        
        // 존재하는 포켓몬들을 HashSet에 저장.
        for(int poketmon : nums){
            oriPoketmon.add(poketmon);
        }
        
        // 중복 제외한 포켓몬의 수
        int oriPoketmonCnt = oriPoketmon.size();
        
        // 중복을 제외한 포켓몬 수와 선택 가능한 포켓몬 수 중 더 작은 값이
        // 최대 고를 수 있는 포켓몬 종류의 수.
        if(oriPoketmonCnt < select){
            answer = oriPoketmonCnt;
        }else {
            answer = select;
        }
        
        return answer;
    }
}