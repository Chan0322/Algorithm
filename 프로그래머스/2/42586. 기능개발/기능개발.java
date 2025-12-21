import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> q = new LinkedList<>();
        
        // 기능마다 기능개발 완료에 걸리는 시간 계산
        for(int i=0; i<progresses.length; i++){
            int day = (100 - progresses[i]) / speeds[i]; // 소요시간
            
            if((100-progresses[i]) % speeds[i] != 0) {
                day++;  /* 소요시간 결과 나머지가 존재하면 하루 더 있어야 함!!! */
            }
            
            q.add(day);
        }
        
        List<Integer> ls = new ArrayList<>();
        
        while(!q.isEmpty()){
            int upload = q.poll(); // 배포일
            int cnt = 1; // 배포 기능 개수
        
            // 다음 기능이 배포일보다 빨리 끝나면 같이 배포
            while(!q.isEmpty() && q.peek()<=upload){
                q.poll();
                cnt++;
            }
            
            ls.add(cnt);
        }
        
        answer = ls.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}