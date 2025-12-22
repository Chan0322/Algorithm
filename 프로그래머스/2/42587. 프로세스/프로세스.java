import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<>();
        
        // 우선순위와 각 프로세스 별 위치를 기억하기 위해 큐에 저장.
        for(int i=0; i<priorities.length; i++){
            // *** 프로세스의 위치를 함께 저장해야 함!!!!!
            // 위치와 우선순위를 함께 저장하기 위해 큐에 배열을 저장함.
            int[] process = new int[2];
            process[0] = i; // 프로세스의 위치(인덱스)를 저장
            process[1] = priorities[i]; // 프로세스 우선순위 저장.
            
            q.add(process); // 큐에 저장.
        }
        
        // 우선순위를 파악하기 위해 정렬
        Arrays.sort(priorities);
        
        int cnt = 0; // 몇 번째 실행인지 횟수
        int last = priorities.length-1; // 마지막 위치.
        
        while(!q.isEmpty()){
            // 큐에서 프로세스를 가져와 위치와 우선순위 확인
            int[] nowPro = q.poll();
            int now = nowPro[0];    // 위치
            int pri = nowPro[1];    // 우선순위
            
            int high = priorities[last-cnt];    // 현재 가장 높은 우선순위
            
            // 현재 꺼낸 프로세스의 우선순위와 비교
            if(pri == high){
                // 가장 높은 우선순위일 경우 시작.
                cnt++;
                
                if(now == location){
                    // 만약 찾으려는 위치였다면 결과 리턴
                    answer = cnt;
                    return answer;
                }
            }else {
                    // 찾던 것 보다 우선순위가 높으면 맨 뒤로
                    q.add(nowPro);
            }
        }
        answer = cnt;
        
        return answer;
    }
}