import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        // 결과를 담기 위해 명령 크기만큼 배열 선언
        answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 시작 위치
            int end = commands[i][1]; // 끝 위치
            int k = commands[i][2]; // 찾는 위치

            // 자른 배열을 저장하기 위한 배열
            int[] arr = new int[end - start + 1];

            // 자른 배열 저장
            int idx = 0;
            for (int j=start-1; j<end; j++) {
                arr[idx++] = array[j];
            }

            // 정렬
            Arrays.sort(arr);

            // 찾는 위치의 수 저장
            answer[i] = arr[k-1];
        }

        return answer;
    }
}