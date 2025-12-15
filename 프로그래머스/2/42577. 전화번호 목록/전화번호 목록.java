import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 전화번호를 저장. HashSet으로 중복 X
        Set<String> set = new HashSet<>();
        for(String phone : phone_book){
            set.add(phone);
        }
        
        // 각 전화번호마다 생길 수 있는 접두어 모든 경우의 수 생성.
        for(String phone : phone_book){
            for(int i = 1; i < phone.length(); i++ ){
                // 전화번호 길이까지 반복하며 각 접두어 생성
                String pre = phone.substring(0, i);
                
                // 접두어가 Set에 존재하는지 확인
                if(set.contains(pre)){
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}