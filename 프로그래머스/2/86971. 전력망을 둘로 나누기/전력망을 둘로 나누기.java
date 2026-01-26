import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        // n : 송전탑 갯수, wires : 연결된 전선 정보.
        // 전선의 갯수는 송전탑 갯수-1 = wires의 길이
        
        // 각 송전탑마다 연결된 다른 송전탑 정보를 담기 위한 리스트.
        // 송전탑은 1번부터 시작하므로 0번 인덱스 사용하지 않아, n+1로 생성.
        List<Integer>[] wireInfo = new ArrayList[n+1];
        
        // 각 전력망 간의 송전탑 개수 차이.
        int diff = Integer.MAX_VALUE;
        
        // 1번부터 n번 송전탑까지 연결된 송전탑 정보를 담기 위한 리스트 객체 생성.
        for(int i=1; i<=n; i++){
            wireInfo[i] = new ArrayList<>();
        }
        
        // 각 송전탑마다 연결된 송전탑 정보 담기.
        for(int[] wire : wires){
            int a = wire[0]; // 송전탑 번호
            int b = wire[1]; // 연결된 송전탑 번호
            
            // 송전탑 연결
            wireInfo[a].add(b);
            wireInfo[b].add(a);
        }
        
        // 연결된 전선을 하나씩 끊고, 끊을 때마다 두 전력망의 송전탑 개수 차이 확인
        
        for(int[] wire : wires){
            int a = wire[0];
            int b = wire[1];
            
            // 연결 끊기
            wireInfo[a].remove(Integer.valueOf(b));
            wireInfo[b].remove(Integer.valueOf(a));
            
            // 차이 확인
            int wiresA = bfs(a, n, wireInfo);
            int wiresB = n - wiresA;
            // 두 전력망의 차이 임시 변수에 저장
            int tmp = Math.abs(wiresA - wiresB);
            // 기존 차이 값과 임시 변수에 저장된 차이 값을 비교해 더 작은 값을 저장.
            diff = Math.min(diff, tmp);
            
            // 전선 다시 연결  => 다음 반복문 진행
            wireInfo[a].add(Integer.valueOf(b));
            wireInfo[b].add(Integer.valueOf(a));
        }
        answer = diff;
        return answer;
    }
    
    // 전력망의 개수를 확인하기 위한 함수
    private int bfs(int start, int n, List<Integer>[] wireInfo) {
        // start : 시작 위치, n : 총 송전탑 갯수
        
        // 해당 송전탑을 방문했는지 여부 확인
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new ArrayDeque<>();
        
        visited[start] = true;
        int cnt = 1; // 송전탑 개수
        q.offer(start);
        
        while(!q.isEmpty()){
            int now = q.poll(); // 현재 송전탑
            
            // 현재 송전탑과 연결된 다른 송전탑 확인
            for(int next : wireInfo[now]){
                // 만약 이미 확인한 송전탑이면 다시 확인할 필요 없음.
                if(!visited[next]){
                    // 확인하지 않은 송전탑이면, 큐에 담고 방문처리.
                    q.offer(next);
                    visited[next] = true;
                    cnt++; // 송전탑 개수 증가
                }
            }
        }
        return cnt;
    }
}