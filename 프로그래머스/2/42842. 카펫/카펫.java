import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];
        
        // 전체 조각 개수 구하기 = 카펫의 넓이
        int area = brown + yellow;
        
        // 가로는 세로보다 길어야 함.
        // 노란색이 중간에 오려면 세로의 최소 길이는 3.
        for(int height=3; height<=area; height++){
            // 면적을 세로 길이로 나눠 가로 길이 구하기
            if(area % height == 0 ){
                int width = area / height;
                
                // 이때, 가로 길이는 세로보다 길거나 같아야 함.
                if(width >= height){
                    // 내부 노란색 조각의 면적 확인.
                    // 노란색은 갈색에 둘러쌓여 있으므로,
                    // 가로-2 * 세로-2 가 노란색 조각의 총 면적(개수).
                    if((width-2)*(height-2)==yellow){
                        answer[0] = width;
                        answer[1] = height;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}