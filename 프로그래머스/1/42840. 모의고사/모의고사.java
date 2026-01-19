import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        // 수포자 패턴
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        // 수포자별 점수
        int[] score = new int[3];
        
        // 점수 계산
        for(int i=0; i<answers.length; i++){
            if(answers[i] == person1[i%person1.length]) score[0]++;
            if(answers[i] == person2[i%person2.length]) score[1]++;
            if(answers[i] == person3[i%person3.length]) score[2]++;
        }
        
        // 최고점
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        /*
        // 최고점을 맞춘 사람들을 담기 위함
        // 배열로 담으면 0이 함께 담겨버려서 문제가 발생함!
        answer = new int[3];
        for(int i=0; i<3; i++){
            if(max == score[i]){
                answer[i] = i+1;
            }
        }*/
        
        // 최고점을 맞춘 사람을 담기 위한 리스트
        List<Integer> l = new ArrayList<>();
        if(max == score[0]) l.add(1);
        if(max == score[1]) l.add(2);
        if(max == score[2]) l.add(3);
        
        // 리스트를 배열로 변환
        answer = new int[l.size()];
        for(int i=0; i<l.size(); i++){
            answer[i] = l.get(i);
        }
        
        return answer;
    }
}