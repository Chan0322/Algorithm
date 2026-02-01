class Solution {
    public int solution(String name) {
        int answer = 0;
        
        int n = name.length();
        int move = n-1; // 커서 변경 없이 오른쪽으로만 이동 시 기본 이동 값.
        
        for(int i=0; i<n; i++){
            // 조이스틱 상하로 이동(알파벳 변경)
            char alpa = name.charAt(i);
            // 원하는 알파벳이 A부터 찾는게 빠른지 Z부터 반대로 찾는게 빠른지에 따라 결정.
            answer += Math.min(alpa-'A', 'Z'-alpa+1);
            
            // 다음 찾는 알파벳이 A인 경우 = 추가 조이스틱 이동이 필요 없음.
            int next = i+1;
            while(next<n && name.charAt(next)=='A'){
                next++;
            }
            
            // 조이스틱 이동
            // i = 현재 위치, n - next = 남은 이동거리
            
            // 오른쪽 갔다가 왼쪽으로
            move = Math.min(move, i*2+(n-next));
            // 왼쪽 갔다가 오른쪽으로
            move = Math.min(move, (n-next)*2+i);
        }
        
        
        return answer+move;
    }
}