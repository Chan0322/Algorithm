import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 쉽게 계산하기 위해 몸무게순으로 정렬
        Arrays.sort(people);
        
        // 가장 가벼운 사람 인덱스
        int min = 0;
        // 가장 무거운 사람 인덱스
        int max = people.length-1;
        
        // 보트 탑승
        while(min <= max){
            // 가장 무거운 사람과 가장 가벼운 사람의 합이 제한을 초과하지 않는 경우
            if(people[min]+people[max] <= limit){
                // 가벼운 사람 함께 탑승
                min++;
            }
            
            // 무거운 사람은 무조건 탑승
            max--;
            
            // 보트 추가
            answer++;
        }
        
        return answer;
    }
}