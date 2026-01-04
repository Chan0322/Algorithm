import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        // 힙 생성 => 최소 힙으로 자동 정렬
        PriorityQueue<Integer> h = new PriorityQueue<>();
        
        // 음식 섞은 횟수
        int mix = 0;
        
        // 힙에 음식 저장
        for(int food : scoville){
            h.add(food);
        }
        
        // 모든 음식이 K보다 커질 때까지 반복
        while(h.peek() < K){
            
            // *****
            // 음식이 2개 미만인 경우 종료해야 함
            if(h.size()<2){
                return -1;
            }
            
            // 가장 작은 값
            int small = h.poll();
            // 다음으로 작은 값
            int next = h.poll();
            
            // 섞기
            int mixed = small + (next*2);
            
            // 힙에 추가
            h.add(mixed);
            
            // 섞은 횟수 증가
            mix++;
        }
        
        answer = mix;
        
        return answer;
    }
}