import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// row
		int m = Integer.parseInt(st.nextToken());	// col
		
		// 보드입력
		char board[][] = new char[n][m];
		for(int i=0; i<n; i++) {
			board[i] = br.readLine().toCharArray();	// 한줄씩 입력받아 char 타입으로 저장
		}
		
		int cnt = Integer.MAX_VALUE; // 최솟값을 구해야 하므로, 최대 값으로 초기화
		
		//8x8 크기로 보드에서 계산 (시작점 기준)
		for(int i=0; i<=n-8; i++) {		//row
			for(int j=0; j<=m-8; j++) {	//col
				int wCnt = 0; //첫 칸이 흰색일 때 바꿔야 할 수
				int bCnt = 0; //첫 칸이 검정일 때 바꿔야 할 수
				
				// 보드와 비교헤 계산
				for(int a=0; a<8; a++) {
					for(int b=0; b<8; b++) {
						// 보드의 현재 칸의 값을 가져와 저장하고
						char color = board[i+a][j+b];
						
						// 색상 비교
						// 색상은 번갈아가며 바뀌어야 함. 짝수 -> 홀수 -> 짝수 -> 홀수 번갈아가며 색이 달라야 함.
						if((a+b)%2 == 0) {
							if(color != 'W') {wCnt++;} // 짝수번째가 흰색일 때(시작이 흰색일 때)
							if(color != 'B') {bCnt++;} // 짝수번째가 블랙일 때(시작이 블랙일 때)
						}else {
							if(color != 'B') {wCnt++;}	// 짝수 흰색 => 홀수 검정이어야 함
							if(color != 'W') {bCnt++;}	// 짝수 검정 => 홀수 흰색이어야 함
						}
					}
				}
				// 최솟값 비교해 저장
				cnt = Math.min(cnt, Math.min(wCnt, bCnt));
			}
		}
		bw.write(cnt+"");
		bw.close();
		br.close();
	}

}
