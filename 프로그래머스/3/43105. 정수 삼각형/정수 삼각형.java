import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        // 삼각형 높이
        int h = triangle.length;
        
        // 바닥 윗줄부터 꼭대기까지 아래에서부터 계산.
        for (int i = h - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // 현재 위치의 값에 아래층의 왼쪽과 오른쪽 중 더 큰 값 더하기.
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        
        // 마지막 꼭대기의 값이 최대값.
        answer = triangle[0][0];
        
        return answer;
    }
}