import java.util.*;

class Solution {
    
    // 만든 단어를 담기위한 리스트
    List<String> dict = new ArrayList<>();
    
    // 사용 가능한 알파벳 모음
    String[] s = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        int answer = 0;
        
        // 단어 생성
        maker("");
        
        // 존재하는 단어일 경우 몇 번째 단어인지 반환
        for(int i=0; i<dict.size(); i++){
            if(dict.get(i).equals(word)){
                answer = i+1;
            }
        }
        return answer;
    }
    
    private void maker(String w){
        // 현재 단어가 빈 문자가 아니면 사전에 저장
        if(!w.equals("")){
            dict.add(w);
        }
        
        // 5글자이면 생성 중지
        if(w.length() == 5){
            return;
        }
        
        // 단어 생성 A~U까지 반복
        for(int i=0; i<5; i++){
            maker(w + s[i]);
        }
    }
}