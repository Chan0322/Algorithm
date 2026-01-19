import java.util.*;

class Solution {
    int answer = 0; // 탐험 횟수
    
    public int solution(int k, int[][] dungeons) {
        // 던전의 탐험 여부를 확인
        boolean[] played = new boolean[dungeons.length];
        
        // 깊이 우선 탐색
        dfs(k, dungeons, played, 0);
        
        return answer;
    }
    
    public void dfs(int k, int[][] dungeons, boolean[] played, int cnt){
        // 현재 탐험한 던전 수
        answer = Math.max(answer, cnt);
        
        // 다음 방문할 던전 찾기
        for(int i=0; i<dungeons.length; i++){
            if(!played[i] && k>=dungeons[i][0]){
                // 방문 가능한 던전인 경우 방문
                played[i] = true;
                // 피로도 소모 & 다음 던전 찾기
                dfs(k-dungeons[i][1], dungeons, played, cnt+1);
                played[i] = false; // 다음 반복문에서는 이 던전이 방문하지 않은 상태.
            }
        }
    }
}