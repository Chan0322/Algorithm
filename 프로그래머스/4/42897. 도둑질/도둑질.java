class Solution {
    public int solution(int[] money) {
        int answer = 0;
        
        int n = money.length;
        
        // 첫 번째 집을 무조건 터는 경우. => 마지막 집 불가.
        int[] thief1 = new int[n];
        thief1[0] = money[0];
        thief1[1] = Math.max(money[0], money[1]);
        
        // 마지막 집 전(n-2)까지만 반복
        for (int i = 2; i < n - 1; i++) {
            // 이번 집을 안 털고 옆집 결과를 가져올지, 
            // 전전 집까지 턴 결과에 이번 집을 더할지 선택
            thief1[i] = Math.max(thief1[i - 1], thief1[i - 2] + money[i]);
        }
        
        // 첫 번째 집을 무조건 털지 않는 경우. => 마지막 집 털기 가능
        int[] thief2 = new int[n];
        thief2[0] = 0; // 첫 집은 패스
        thief2[1] = money[1];
        
        // 마지막 집까지 반복
        for (int i = 2; i < n; i++) {
            thief2[i] = Math.max(thief2[i - 1], thief2[i - 2] + money[i]);
        }
        
        // 둘 중 더 큰 값이 정답
        // 첫번째 경우는 마지막-1(n-2) 위치가 최댓값,
        // 두번째 경우는 마지막(n-1) 위치가 최댓값
        answer = Math.max(thief1[n - 2], thief2[n - 1]);
        
        return answer;
    }
}