import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>(); // 다리
        int second = 0; // 소요시간
        int truckWeight = 0; // 다리위 트럭 무게
        int truckNum = 0; // 대기중인 트럭 번호
        
        // 다리 초기 상태. 트럭이 없으므로 0
        for(int i=0; i<bridge_length; i++){
            q.add(0);
        }
        
        // 트럭 번호를 이용해 모든 트럭이 다리를 통과할 때 까지 반복
        while(truckNum < truck_weights.length){
            second++; // 시간 증가
            
            // 트럭이 다리를 빠져나갔다면 트럭의 무게 -. 트럭이 빠져나가지 않았다면 -0
            truckWeight -= q.poll();
            
            // 다음 트럭의 무게
            int next = truck_weights[truckNum];
            
            if(truckWeight + next <= weight){
                // 다음 트럭이 다리에 올라올 수 있는 무게일 경우
                q.add(next); //트럭 진입
                truckWeight += next;    // 진입 트럭 무게 추가
                truckNum++; // 다음 트럭
            }else {
                // 다음 트럭이 진입 불가능한 상태이면
                // 다음 트럭이 진입 가능할 때 까지 0 저장
                q.add(0);
            }
        }
        
        // 마지막 트럭이 다리 진입 후 통과 완료할 때 까지의 시간 계산.
        answer = second + bridge_length;
        
        return answer;
    }
}