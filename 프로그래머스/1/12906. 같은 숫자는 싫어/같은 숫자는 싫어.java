import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> st = new Stack<>();
        
        // 배열에 담긴 숫자를 스택에 저장.
        // 스택에 저장된 숫자와 배열의 다음 숫자가 같으면 패스
        for(int n : arr) {
            if(st.isEmpty() || st.peek() != n){
                st.push(n);
            }
        }
        
        // 스택에 담긴 숫자 배열에 저장.
        answer = new int[st.size()];
        for(int i = st.size() - 1; i>=0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}