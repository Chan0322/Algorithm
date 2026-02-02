import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        // 차량이 나가는 순서대로 오름차순 정렬.
        // 먼저 나가는 순서대로 해야 최대한 많은 차량을 찍을 수 있음.
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
        
        // 설치된 카메라 위치
        int camera = -30001;
        
        for(int[] route : routes){
            int in = route[0];
            int out = route[1];
            
            // 현재 진입한 차량이 설치된 카메라보다 뒤에 있는 경우 카메라에 찍히지 않음
            if(camera < in){
                // 차량이 나가는 지점에 카메라 추가.
                answer++;
                camera = out;
            }
        }
        
        return answer;
    }
}