import java.util.*;

class Solution {
    
    static int[] parent; // 각 섬의 부모 섬을 담기 위한 배열.
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        // 다리 건설 비용 기준 오름차순 정렬
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
        
        // 초기화
        parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
        
        // 비용 적은 다리부터 확인
        for(int[] bridge : costs){
            int from = bridge[0];
            int to = bridge[1];
            int cost = bridge[2];
            
            if(find(from) != find(to)){
                // 두 섬의 최상위에 위치한 부모가 다른 경우
                // 두 섬을 연결하고 비용 추가
                add(from, to);
                answer += cost;
            }
        }
        return answer;
    }
    
    // 섬의 최상위에 위치한 부모 찾는 함수
    public int find(int island){
        if(parent[island] == island){
            return island;
        }
        return parent[island] = find(parent[island]);
    }
    
    // 두 섬을 연결하는 함수
    public void add(int a, int b){
        int landA = find(a);
        int landB = find(b);
        if(landA != landB){
            parent[landB] = landA;
        }
    }
}