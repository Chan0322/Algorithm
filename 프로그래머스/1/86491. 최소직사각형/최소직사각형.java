import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 모든 명함을 수납할 수 있는 가장 작은 지갑을 만드려면
        // 명함을 회전시켜 넣어야 한다.
        
        // 지갑 크기 : 가로 최대 * 세로 최대
        int maxW = 0;
        int maxH = 0;
        
        // 명함들을 하나씩 가져오고
        for(int[] businessCard : sizes){
            // 명함의 가로길이와 세로길이를 확인해 긴 부분을 가로로 설정.
            int w = Math.max(businessCard[0], businessCard[1]);
            int h = Math.min(businessCard[0], businessCard[1]);
            
            // 이전 다른 명함 크기와 비교해 가장 큰 가로, 세로 길이를 구한다.
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }
        
        // 지갑 사이즈 구하기
        answer = maxW * maxH;
        
        return answer;
    }
}