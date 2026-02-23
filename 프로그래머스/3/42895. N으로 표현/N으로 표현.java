import java.util.*;

class Solution {
    public int solution(int N, int number) {
        
        // N = number이면 1
        if(N == number) {
            return 1;
        }
        
        // N을 i번 사용해 생성 가능한 수의 집합을 담기 위한 배열
        Set<Integer>[] s = new HashSet[9];
        for(int i=1; i<=8; i++){
            s[i] = new HashSet<>();
        }
        
        // N을 i번 이어 붙인 숫자 초기화
        int tmpN = N;
        for (int i = 1; i <= 8; i++) {
            s[i].add(tmpN);
            tmpN = tmpN * 10 + N;
        }
        
        // i번 사용하여 만들 수 있는 수 찾기
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                // i번 사용해서 만든 결과는 (j번 사용한 결과)(+,-,*,/)(i-j번 사용한 결과)
                for (int op1 : s[j]) { // j번 사용해서 나온 수
                    for (int op2 : s[i - j]) { // i-j번 사용해서 나온 수
                        s[i].add(op1 + op2);
                        s[i].add(op1 - op2);
                        s[i].add(op1 * op2);
                        if (op2 != 0) s[i].add(op1 / op2);
                    }
                }
            }
            // i번 사용해서 만든 집합에 number가 들어있다면 리턴
            if (s[i].contains(number)) return i;
        }
        
        return -1;
    }
}