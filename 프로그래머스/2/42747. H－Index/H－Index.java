import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 인용 횟수 정렬
        Arrays.sort(citations);
        
        // 논문 수
        int n = citations.length;
        
        // 논문을 보며 hIdx 계산
        for(int i=0; i<n; i++){
            int hIdx = n-i;
            
            // 현재 논문 인용수가 남은 논문 인용수보다 크거나 같으면 hIdx 충족.
            if(citations[i] >= hIdx){
                answer = hIdx;
                break;
            }
        }
        
        return answer;
    }
}