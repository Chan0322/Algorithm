import java.util.*;

class Solution {
    public int solution(String arr[]) {
        int answer = -1;
        
        // 숫자 개수
        int n = arr.length/2 + 1;
        
        // i부터 j까지 연산 했을 때 최대값
        int[][] max = new int[n][n];
        // i부터 j까지 연산 했을 때의 최소값
        int[][] min = new int[n][n];
        
        for(int i=0; i<n; i++){
            // 초기 값 설정
            Arrays.fill(max[i], Integer.MIN_VALUE);
            Arrays.fill(min[i], Integer.MAX_VALUE);
            
            // 1개의 숫자인 경우에는 본인이 최대/최소 값.
            int num = Integer.parseInt(arr[i*2]);
            max[i][i] = min[i][i] = num;
        }
        
        // 구간의 길이를 늘리며 계산
        // 숫자 2개 연산, 숫자 3개 연산.......
        for (int step = 1; step < n; step++) {
            for (int i = 0; i < n - step; i++) {
                int j = i + step; // i부터 j까지의 구간
                
                // k는 i와 j 사이를 가르는 기준점 (괄호를 치는 위치)
                // (i~k 구간)(연산자)(k+1~j 구간)
                for (int k = i; k < j; k++) {
                    String op = arr[k * 2 + 1]; // 숫자 사이의 연산자 확인
                    
                    if (op.equals("+")) {
                        // (최대 + 최대)가 전체 최대, (최소 + 최소)가 전체 최소
                        max[i][j] = Math.max(max[i][j], max[i][k] + max[k + 1][j]);
                        min[i][j] = Math.min(min[i][j], min[i][k] + min[k + 1][j]);
                    } else {
                        // 빼기일 때 (최대 - 최소)가 전체 최대, (최소 - 최대)가 전체 최소
                        max[i][j] = Math.max(max[i][j], max[i][k] - min[k + 1][j]);
                        min[i][j] = Math.min(min[i][j], min[i][k] - max[k + 1][j]);
                    }
                }
            }
        }
        
        // 0번째 숫자부터 마지막 숫자까지 연산한 결과의 최댓값
        answer = max[0][n - 1];
        
        return answer;
    }
}