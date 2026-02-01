import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 학생 번호는 체격 순으로 매겨졌으므로 학생들 정렬.
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 체육복을 도난당하지 않은 학생 수
        answer = n - lost.length;
        
        // 체육복을 빌려줄 수 없는 학생(여벌 옷이 있지만, 도난당한 경우)
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    // 수업 참여 가능한 학생 수에 추가.
                    answer++;
                    // 수업을 듣게 된 학생을 따로 표시.
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        // 옷을 빌리는 학생
        for(int i=0; i<lost.length; i++){
            if(lost[i] == -1) {
                continue; // 체육복 문제가 해결된 학생 제외
            }
            
            for(int j=0; j<reserve.length; j++){
                if(reserve[j] == -1){
                    continue; // 체육복을 이미 빌려준 학생 제외
                }
                
                // 학생번호의 +- 1에 위치한 학생만 빌려줄 수 있음.
                if(reserve[j] == lost[i]-1 || reserve[j] == lost[i]+1){
                    // 수업참여가 가능해진 학생 수 증가.
                    answer++;
                    reserve[j] = -1; // 빌려준 학생 처리.
                    break;
                }
            }
        }
        
        return answer;
    }
}