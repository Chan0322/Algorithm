import java.util.*;

class Solution {
    
    // 중복 없이 소수 저장하기 위함
    HashSet<Integer> num = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        // 숫자 조합하기
        numMaker("", numbers);
        
        // set에 담긴 조합된 숫자들을 확인하고
        for(int n : num){
            // 소수인지 확인
            if(isPrime(n)){
                answer++;
            }
        }
        
        return answer;
    }
    
    // 숫자 조합하기
    // s는 지금까지 조합한 숫자
    // nums는 남은 숫자
    public void numMaker(String s, String nums){
        if(!s.equals("")){
            // 조합한 숫자가 있으면 set에 추가
            num.add(Integer.parseInt(s));
        }
        
        // 남은 숫자 계속 조합
        for(int i=0; i<nums.length(); i++){
            // i번째 숫자를 골라
            char ch = nums.charAt(i);
            // 그 외의 나머지 숫자를 모아서
            String remain = nums.substring(0, i) + nums.substring(i+1);
            
            // 조합 함수 재귀
            numMaker(s+ch, remain);
        }
    }
    
    // 소수인지 확인
    public boolean isPrime(int num){
        if(num < 2) return false; // 0, 1 제외
        
        // 에라토스테네스 체
        // 숫자의 제곱근까지의 수 중, 나눠 떨어지는 수가 있으면 소수 아님.
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        
        return true;
    }
}