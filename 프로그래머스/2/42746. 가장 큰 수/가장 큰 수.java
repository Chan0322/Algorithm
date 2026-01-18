import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // 문자 배열로
        String[] num = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            num[i] = String.valueOf(numbers[i]);
        }
        
        // 정렬
        // n1+n2가 더 크면 양수, 같으면 0, 작으면 음수를 이용해 정렬
        Arrays.sort(num, (n1, n2) -> (n2+n1).compareTo(n1+n2));
        
        // 만약 모든 숫자가 0이면 0
        if(num[0].equals("0")){
            answer = "0";
            return answer;
        }
        
        // 문자열 결합
        StringBuilder res = new StringBuilder();
        for(String str : num){
            res.append(str);
        }
        
        answer = res.toString();
        return answer;
    }
}