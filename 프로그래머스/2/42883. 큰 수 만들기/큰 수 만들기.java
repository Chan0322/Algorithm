import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        int size = number.length()-k; // 목표 길이
        
        // 숫자 담기 위한 스택
        Stack<Character> st = new Stack<>();
        int len = number.length();
        
        for(int i=0; i<len; i++){
            char curr = number.charAt(i);
            
            // 스택에 숫자가 존재하며 제거할 숫자가 남았고
            // 스택 맨 위의 숫자가 현재 숫자보다 작은 경우
            while(!st.isEmpty() && k>0 && st.peek()<curr){
                // 현재 숫자보다 작은 숫자를 재거
                st.pop();
                k--;    // 제거 횟수 반영.
            }
            
            // 현재 숫자 스택에 저장
            st.push(curr);
        }
        
        // 예외상황
        // 만약 숫자가 내림차순이라 제거되지 못한 경우
        // 뒤에서 k만큼 제거
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size; i++){
            sb.append(st.get(i));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}