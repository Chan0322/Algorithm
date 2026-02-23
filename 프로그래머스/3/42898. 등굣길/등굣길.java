import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        // 나누는 수
        int num = 1000000007;
        
        // 집의 위치가 (1,1)이므로 크기를 (n+1)*(m+1)로 생성
        int[][] localMap = new int[n + 1][m + 1];
        
        // 침수지역 = -1
        for (int[] puddle : puddles) {
            localMap[puddle[1]][puddle[0]] = -1;
        }
        
        // 시작점 = 집
        localMap[1][1] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                
                // 만약 현재 칸이 침수지역이면
                if (localMap[i][j] == -1) {
                    localMap[i][j] = 0; // 이 칸을 지나는 경로는 0개
                    continue;
                }
                
                // 현재 칸 오는 법 = 위에서 내려오기 + 왼쪽에서 오기
                // 위쪽 칸이 범위 내에 있다면 더하기
                if (i > 1) {
                    localMap[i][j] = (localMap[i][j] + localMap[i - 1][j]) % num;
                }
                // 왼쪽 칸이 범위 내에 있다면 더하기
                if (j > 1) {
                    localMap[i][j] = (localMap[i][j] + localMap[i][j - 1]) % num;
                }
            }
        }
        
        // 학교 위치에 누적된 최종 경로의 수
        answer = localMap[n][m];
        return answer;
    }
}