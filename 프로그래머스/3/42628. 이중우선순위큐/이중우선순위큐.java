import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        // 최솟값과 최댓값을 찾기 위한 우선순위 큐 2개 생성.
        PriorityQueue<Integer> min = new PriorityQueue<>(); // 최소
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder()); //최대
        
        for(String oper : operations){
            // 알파벳과 숫자 분리
            String[] tmp = oper.split(" ");
            String eng = tmp[0]; // 알파벳
            int num = Integer.parseInt(tmp[1]); // 숫자
            
            // 알파벳이 I인 경우 삽입
            if(eng.equals("I")){
                min.add(num);
                max.add(num);
            }else if(!min.isEmpty() && !max.isEmpty()){
                // 힙이 비어있지 않은 경우 삭제 가능
                // 최댓값 삭제
                if(num == 1){
                    int maxN = max.poll();
                    min.remove(maxN);
                }else {
                    // 최솟값 삭제
                    int minN = min.poll();
                    max.remove(minN);
                }
            }
        }
        
        if(min.isEmpty() && max.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = max.peek();
            answer[1] = min.peek();
        }
        
        return answer;
    }
    
}