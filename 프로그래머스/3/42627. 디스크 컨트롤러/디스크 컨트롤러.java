import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        int idx = 0; // 작업번호
        int end = 0; // 작업 종료 시각 = 현재 시간
        int finish = 0; // 완료된 작업 수
        
        // 소요 시간이 짧은 것을 먼저 처리해야 평균 반환 시간 줄일 수 있다.
        
        // 요청 시점 순으로 배열 정렬
        Arrays.sort(jobs, (a1, a2)->a1[0]-a2[0]);
        
        // 힙(우선순위 큐)는 소요시간을 우선으로 정렬
        PriorityQueue<int[]> h = new PriorityQueue<>((a1, a2)->a1[1]-a2[1]);
        
        while(finish<jobs.length){
            // 현재(작업 종료 시간)까지 들어온 모든 요청 힙에 저장
            while(idx<jobs.length && jobs[idx][0]<=end){
                h.add(jobs[idx++]);
            }
            
            if(h.isEmpty()){
                // 현재 처리할 작업이 없으면 다음 작업으로
                end = jobs[idx][0];
            }else {
                // 작업시간이 가장 짧은 작업을 꺼냄
                int[] process = h.poll();
                // 총 시간 = (현재시간-요청시간)+소요시간
                answer += (end - process[0]) + process[1];
                // 현재시간(작업 종료 시간) 업뎃
                end += process[1];
                finish++;
            }
        }
        
        return answer/jobs.length;
    }
}