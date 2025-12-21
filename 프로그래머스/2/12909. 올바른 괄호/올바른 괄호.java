import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();

        // 입력된 문자열을 한 문자씩 불러와 확인
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            // 열린 괄호로 시작해야 하므로 열린 괄호일 때 스택에 저장.
            if(c=='('){
                st.push(c);
            }else{
                // 닫힌 괄호
                if(st.isEmpty()){
                    // 스택이 비어 있는데 닫힌 괄호가 있으면 올바르지 않음.
                    return false;
                }
                st.pop();
            }
        }
        
        answer = st.isEmpty();   /*마지막에 최종 확인 필요!!!!!*/
        
        return answer;
    }
}