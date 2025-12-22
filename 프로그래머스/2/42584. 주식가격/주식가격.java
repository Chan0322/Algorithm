import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];    // 가격 배열의 길이만큼
        
        Stack<Integer> st = new Stack<>();  // 가격의 인덱스 (초)를 저장하는 스택
        
        for(int i=0; i<prices.length; i++){
            // 가격이 떨어진 경우
            while(!st.isEmpty() && prices[i] < prices[st.peek()]){
                // 비어있는 상태의 스택이 아니고, 현재 가격이 스택 맨 위의 가격보다 낮은 경우
                int minus = st.pop(); // 가격이 떨어졌을 때의 인덱스
                answer[minus] = i-minus;
                // 가격이 떨어지지 않은 시간 = 현재 시간 - 가격 떨어진 시간
            }
            
            // 가격이 떨어지지 않은 경우 스택에 현재 시간 저장
            st.push(i);
        }
        
        // 마지막까지 가격이 떨어지지 않은 경우 *****
        while(!st.isEmpty()){
            int keep = st.pop(); // 주식이 들어온 시간
            answer[keep] = (prices.length-1) - keep; // 마지막 시간 - 들어온 시간 = 유지시간
        }
        
        return answer;
    }
}